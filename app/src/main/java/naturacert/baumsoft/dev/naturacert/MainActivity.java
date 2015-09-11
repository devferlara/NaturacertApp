package naturacert.baumsoft.dev.naturacert;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import naturacert.baumsoft.dev.naturacert.extras.httpConections;
import naturacert.baumsoft.dev.naturacert.extras.katana;
import naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuth2Client;
import naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuthUtils;
import naturacert.baumsoft.dev.naturacert.extras.oauth2Client.Token;

public class MainActivity extends Activity {

    private StringBuilder sb = new StringBuilder(httpConections.SERVER + httpConections.API + "fincas/agregar/");
    private List<NameValuePair> datosParaRegistro = new ArrayList<NameValuePair>();
    private String usuarioLogin, password;
    private long id_row_token;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);



        katana kata = new katana();
        if(kata.checkUser()){
            TokensBD tkn = kata.getToken();
            OAuth2Client.token = new Token(tkn.getExpiresIn(), tkn.getTokenType(), tkn.getRefreshToken(), tkn.getAccessToken());
            //Intent pasar = new Intent(MainActivity.this, crear_finca_individual.class);
            Intent pasar = new Intent(MainActivity.this, iniciorac.class);
            startActivity(pasar);
            finish();
        }

        LinearLayout contenedor = (LinearLayout) findViewById(R.id.contenedor);
        contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText edi1 = (EditText) findViewById(R.id.usuario);
                EditText edi2 = (EditText) findViewById(R.id.pass);

                InputMethodManager imm = (InputMethodManager) getSystemService(
                        Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edi1.getWindowToken(), 0);
                imm.hideSoftInputFromWindow(edi2.getWindowToken(), 0);
            }
        });

        //poblarBD poblarbase = new poblarBD();
        //poblarbase.poblar();

        Button iniciar = (Button) findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText usuario = (EditText) findViewById(R.id.usuario);
                EditText pass = (EditText) findViewById(R.id.pass);

                ArrayList<String> accesos = new ArrayList<String>();
                accesos.add(usuario.getText().toString());
                accesos.add(pass.getText().toString());

                progress = ProgressDialog.show(MainActivity.this, "Información",
                        "Iniciando sesión, por favor espere un momento.", true);
                new iniciarSesion().execute(accesos);

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText pass = (EditText) findViewById(R.id.pass);
        pass.setText("");
    }


    /**
     * Iniciamos sesion con datos de usuario y contraseña
     * En caso de que no haya un usuario creado se creara uno
     * si el login es correcto el usuario cargara los datos del servidor
     */
    class iniciarSesion extends AsyncTask<ArrayList<String>, Void, Boolean> {
        @Override
        protected Boolean doInBackground(ArrayList<String>... params) {
            OAuth2Client oa = new OAuth2Client(params[0].get(0), params[0].get(1));
            OAuth2Client.token = oa.getAccessToken();
            if (OAuth2Client.token == null)
                return false;
            else
                return true;
        }

        protected void onPostExecute(Boolean values) {
            if (values)
                guardarToken();
            else{
                if(progress.isShowing())
                    progress.dismiss();
                Toast.makeText(MainActivity.this, "Usuario y clave inválido.", Toast.LENGTH_SHORT).show();
            }

        }
    }

    /**
     * Guardamos el token en la base de datos
     * Psdt. Sólo se guarda un token.
     * El cual corresponde al tusuario actualmente logueado
     */
    public void guardarToken() {
        /**
         * Antes de crear un usuario nuevo borramos toda la informacion
         * del posible usuario anterior
         */
        katana kata = new katana();
        //kata.clearUserBD();

        TokensBD tkn = new TokensBD();
        tkn.setExpiresIn(OAuth2Client.token.getExpiresIn());
        tkn.setExpiresAt(OAuth2Client.token.getExpiresAt());
        tkn.setTokenType(OAuth2Client.token.getTokenType());
        tkn.setRefreshToken(OAuth2Client.token.getRefreshToken());
        tkn.setAccessToken(OAuth2Client.token.getAccessToken());
        OAuth2Client.token = new Token(tkn.getExpiresIn(), tkn.getTokenType(), tkn.getRefreshToken(), tkn.getAccessToken());
        id_row_token = DaoAPP.daoSession.getTokensBDDao().insert(tkn);
        new iniciarSesionMain().execute(usuarioLogin, password);
    }


    /**
     * Guardamos el token en la base de datos
     * Psdt. Sólo se guarda un token.
     * El cual corresponde al tusuario actualmente logueado
     */
    class iniciarSesionMain extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            OAuthUtils oau = new OAuthUtils();
            StringBuilder sb = new StringBuilder(httpConections.API);
            sb.append("me/");
            return oau.getProtectedResource(OAuth2Client.token, sb.toString());
        }

        protected void onPostExecute(String values) {
            if (values != null) {
                Auditores user = new Auditores();
                JSONArray res;
                try {
                    res = new JSONArray(values);
                    JSONObject obj = res.getJSONObject(0);
                    Log.d("RTA", obj.toString());
                    user.setNombre(obj.getString("nombres"));
                    user.setApellido(obj.getString("apellidos"));
                    user.setFoto(obj.getString("foto"));
                    user.setUsuario(obj.getString("usuario"));
                    user.setIdToken(id_row_token);
                    user.setRef_auditor(obj.getInt("auditor"));
                    DaoAPP.daoSession.getAuditoresDao().insert(user);

                    if(progress.isShowing())
                        progress.dismiss();

                    //Intent pasar = new Intent(MainActivity.this, iniciorac.class);
                    //finish();
                    //startActivity(pasar);

                    progress = ProgressDialog.show(MainActivity.this, "Información",
                            "Descargando datos del usuario, por favor espere.", true);

                    new descargarFincas().execute();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Toast.makeText(MainActivity.this, "No hemos podido iniciar sesión, asegurate de estar ocnectado a internet.", Toast.LENGTH_SHORT).show();
            }
        }
    }


    class descargarFincas extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            OAuthUtils oau = new OAuthUtils();
            StringBuilder sb = new StringBuilder(httpConections.API);
            sb.append("get_fincas/");
            return oau.getProtectedResource(OAuth2Client.token, sb.toString());
        }

        protected void onPostExecute(String values) {

            if(progress.isShowing())
                progress.dismiss();

            if (values != null) {

                JSONArray res;
                try {
                    res = new JSONArray(values);
                    JSONObject obj = res.getJSONObject(0);
                    Log.d("RTA", obj.toString());


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Toast.makeText(MainActivity.this, "No hemos podido iniciar sesión, asegurate de estar ocnectado a internet.", Toast.LENGTH_SHORT).show();
            }
        }
    }

}