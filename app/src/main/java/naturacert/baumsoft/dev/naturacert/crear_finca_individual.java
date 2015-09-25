package naturacert.baumsoft.dev.naturacert;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import naturacert.baumsoft.dev.naturacert.extras.httpConections;
import naturacert.baumsoft.dev.naturacert.extras.katana;
import naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuth2Client;
import naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuthUtils;


public class crear_finca_individual extends ActionBarActivity {

    StringBuilder sb, sbp;
    int hour, minute, day, month, year;
    Clientes cliente;
    Fincas finca;
    int tipo;
    List<Clientes> clientes_lista;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_finca_individual);

        Button guardar = (Button) findViewById(R.id.guardar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturarFinca();
            }
        });

        katana kata = new katana();
        String[] datosAuditor;
        datosAuditor = kata.informacionAuditor();

        TextView nombre_auditor = (TextView) findViewById(R.id.nombre_auditor);
        nombre_auditor.setText(datosAuditor[0] + " " + datosAuditor[1]);

        montarClientes();

        ImageButton getCoordenadas = (ImageButton) findViewById(R.id.getCoordenadas);
        getCoordenadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GPSTracker gps = new GPSTracker(crear_finca_individual.this);
                if (gps.canGetLocation()) {
                    EditText latitud = (EditText) findViewById(R.id.latitud);
                    EditText longitud = (EditText) findViewById(R.id.longitud);
                    latitud.setText(String.valueOf(gps.getLatitude()));
                    longitud.setText(String.valueOf(gps.getLongitude()));
                    gps.stopUsingGPS();
                } else {
                    gps.showSettingsAlert();
                    gps.stopUsingGPS();
                }
            }
        });

        EditText grupo = (EditText) findViewById(R.id.grupo);
        TextView grupo_textview = (TextView) findViewById(R.id.grupo_textview);
        TextView nueva_finca = (TextView) findViewById(R.id.nueva_finca);
        Intent intent = getIntent();
        if(intent.getStringExtra("tipo").equals("1")){
            grupo.setVisibility(View.GONE);
            grupo_textview.setVisibility(View.GONE);
            nueva_finca.setText("Nueva Finca Individual");
        } else {
            nueva_finca.setText("Nueva Finca Grupal");
        }

        LinearLayout padre_de_todo = (LinearLayout) findViewById(R.id.padre_de_todo);
        padre_de_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
            }
        });



        final TextView hora = (TextView) findViewById(R.id.hora);
        final TextView fecha = (TextView) findViewById(R.id.fecha);

        hora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.hora, null);
                final AlertDialog constructor = new AlertDialog.Builder(crear_finca_individual.this).create();
                constructor.setView(dialoglayout);
                constructor.show();
                constructor.setCancelable(true);

                final TimePicker horaTomar = (TimePicker) dialoglayout.findViewById(R.id.hora);

                Button aceptar = (Button) dialoglayout.findViewById(R.id.aceptar);
                aceptar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String formarHora = horaTomar.getCurrentHour() + ":" + horaTomar.getCurrentMinute();
                        hour = horaTomar.getCurrentHour();
                        minute = horaTomar.getCurrentMinute();
                        hora.setText(formarHora);
                        constructor.dismiss();
                    }
                });
            }
        });

        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.fecha, null);
                final AlertDialog constructor = new AlertDialog.Builder(crear_finca_individual.this).create();
                constructor.setView(dialoglayout);
                constructor.show();
                constructor.setCancelable(true);

                final DatePicker fechaTomar = (DatePicker) dialoglayout.findViewById(R.id.fecha);

                Button aceptar = (Button) dialoglayout.findViewById(R.id.aceptar);
                aceptar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String formarFecha = fechaTomar.getDayOfMonth() + "-" + (fechaTomar.getMonth() + 1) + "-" + fechaTomar.getYear();
                        day = fechaTomar.getDayOfMonth();
                        month = fechaTomar.getMonth();
                        year = fechaTomar.getYear();
                        fecha.setText(formarFecha);
                        constructor.dismiss();
                    }
                });
            }
        });

        ImageButton agregarCliente = (ImageButton) findViewById(R.id.agregarCliente);
        agregarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.agregar_cliente, null);
                final AlertDialog constructor = new AlertDialog.Builder(crear_finca_individual.this).create();
                constructor.setView(dialoglayout);
                constructor.show();
                constructor.setCancelable(true);

                final EditText nombres = (EditText) dialoglayout.findViewById(R.id.nombres);
                final EditText apellidos = (EditText) dialoglayout.findViewById(R.id.apellidos);
                final EditText documento = (EditText) dialoglayout.findViewById(R.id.documento);
                final EditText telefono = (EditText) dialoglayout.findViewById(R.id.telefono);
                final EditText direccion = (EditText) dialoglayout.findViewById(R.id.direccion);
                final EditText email = (EditText) dialoglayout.findViewById(R.id.email);

                Button aceptar = (Button) dialoglayout.findViewById(R.id.aceptar);
                aceptar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!nombres.getText().toString().equals("") && !apellidos.getText().toString().equals("") && !documento.getText().toString().equals("") && !telefono.getText().toString().equals("") && !direccion.getText().toString().equals("") && isEmailValid(email.getText().toString())) {

                            progress = ProgressDialog.show(crear_finca_individual.this, "Información",
                                    "Estamos creando el cliente, espere un momento.", true);

                            sbp = new StringBuilder(httpConections.API);
                            sbp.append("clientes/agregar/");
                            sbp.append("?nombres=");
                            sbp.append(nombres.getText().toString());
                            sbp.append("&apellidos=");
                            sbp.append(apellidos.getText().toString());
                            sbp.append("&documento=");
                            sbp.append(documento.getText().toString());
                            sbp.append("&telefono=");
                            sbp.append(telefono.getText().toString());
                            sbp.append("&direccion=");
                            sbp.append(direccion.getText().toString());
                            sbp.append("&email=");
                            sbp.append(email.getText().toString());
                            new guardarCliente().execute();

                            cliente = new Clientes();
                            cliente.setNombres(nombres.getText().toString());
                            cliente.setApellidos(apellidos.getText().toString());
                            cliente.setDocumento(documento.getText().toString());
                            cliente.setDirección(direccion.getText().toString());
                            cliente.setTelefono(telefono.getText().toString());
                            cliente.setEmail(email.getText().toString());

                            constructor.dismiss();

                        } else {
                            Toast.makeText(crear_finca_individual.this, "Diligencie todos los datos antes de guardar la finca.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }

    private void capturarFinca() {

        /**
         * Obtención de datos
         */

        sb = new StringBuilder(httpConections.API);
        sb.append("fincas/agregar/");

        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText codigo = (EditText) findViewById(R.id.codigo);
        TextView hora = (TextView) findViewById(R.id.hora);
        TextView fecha = (TextView) findViewById(R.id.fecha);
        ImageButton imagen = (ImageButton) findViewById(R.id.camara);
        Spinner departamento = (Spinner) findViewById(R.id.departamento);
        EditText municipio = (EditText) findViewById(R.id.municipio);
        EditText vereda = (EditText) findViewById(R.id.vereda);
        EditText altura = (EditText) findViewById(R.id.altura);
        EditText latitud = (EditText) findViewById(R.id.latitud);
        EditText longitud = (EditText) findViewById(R.id.longitud);
        EditText propietario = (EditText) findViewById(R.id.propietario);
        EditText grupo = (EditText) findViewById(R.id.grupo);
        Spinner tipo_auditoria = (Spinner) findViewById(R.id.tipo_auditoria);
        Spinner tipo_auditor = (Spinner) findViewById(R.id.tipo_auditor);

        EditText area_finca = (EditText) findViewById(R.id.area_finca);
        EditText area_conservacion = (EditText) findViewById(R.id.area_conservacion);
        EditText area_infraestructura = (EditText) findViewById(R.id.area_infraestructura);
        EditText periodo_cosecha = (EditText) findViewById(R.id.periodo_cosecha);
        EditText produccion_regional = (EditText) findViewById(R.id.produccion_regional);
        EditText fr_cafe = (EditText) findViewById(R.id.fr_cafe);
        EditText almendra_sana = (EditText) findViewById(R.id.almendra_sana);
        EditText problemas_sanitarios = (EditText) findViewById(R.id.problemas_sanitarios);
        EditText trabajadores_permanentes = (EditText) findViewById(R.id.trabajadores_permanentes);
        EditText trabajadores_temporales = (EditText) findViewById(R.id.trabajadores_temporales);
        EditText documentos_anexos = (EditText) findViewById(R.id.documentos_anexos);
        EditText proveedores_visitados = (EditText) findViewById(R.id.proveedores_visitados);
        EditText observaciones = (EditText) findViewById(R.id.observaciones);

        if (!nombre.getText().toString().equals("") && departamento.getSelectedItemId() != 0 && !codigo.getText().toString().equals("") && !hora.getText().toString().equals("") && !fecha.getText().toString().equals("") && !municipio.getText().toString().equals("") && !vereda.getText().toString().equals("") && !altura.getText().toString().equals("") && !latitud.getText().toString().equals("") && !longitud.getText().toString().equals("") && !propietario.getText().toString().equals("") && !area_finca.getText().toString().equals("") && !area_conservacion.getText().toString().equals("") && !area_infraestructura.getText().toString().equals("") && !periodo_cosecha.getText().toString().equals("") && !produccion_regional.getText().toString().equals("") && !fr_cafe.getText().toString().equals("") && !trabajadores_temporales.getText().toString().equals("") && !almendra_sana.getText().toString().equals("") && !problemas_sanitarios.getText().toString().equals("") && !trabajadores_permanentes.getText().toString().equals("") && !documentos_anexos.getText().toString().equals("") && !proveedores_visitados.getText().toString().equals("") && !observaciones.getText().toString().equals("")) {

            StringBuilder cultivos = new StringBuilder("");

            CheckBox check1 = (CheckBox) findViewById(R.id.check1);
            if(check1.isChecked()){
                EditText tabla_cultivo_1 = (EditText) findViewById(R.id.tabla_cultivo_1);
                EditText tabla_variedad_1 = (EditText) findViewById(R.id.tabla_variedad_1);
                EditText tabla_produccionyear_1 = (EditText) findViewById(R.id.tabla_produccionyear_1);
                EditText tabla_produccionha_1 = (EditText) findViewById(R.id.tabla_produccionha_1);
                EditText tabla_produccionestimada_1 = (EditText) findViewById(R.id.tabla_produccionestimada_1);
                if(tabla_cultivo_1.getText().toString().isEmpty() || tabla_variedad_1.getText().toString().isEmpty() || tabla_produccionyear_1.getText().toString().isEmpty() || tabla_produccionha_1.getText().toString().isEmpty() || tabla_produccionestimada_1.getText().toString().isEmpty()){
                    Toast.makeText(crear_finca_individual.this, "Hemos encontrado datos incompletos en la tabla de cultivos, fila # 1, complételos o elimínelos antes de continuar", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    cultivos.append("&cul_var[]=");
                    cultivos.append(tabla_cultivo_1.getText().toString());
                    cultivos.append("&area[]=");
                    cultivos.append(tabla_variedad_1.getText().toString());
                    cultivos.append("&prod_year_ant[]=");
                    cultivos.append(tabla_produccionyear_1.getText().toString());
                    cultivos.append("&prod_hect[]=");
                    cultivos.append(tabla_produccionha_1.getText().toString());
                    cultivos.append("&prod_esti[]=");
                    cultivos.append(tabla_produccionestimada_1.getText().toString());
                }
            }

            CheckBox check2 = (CheckBox) findViewById(R.id.check2);
            if(check2.isChecked()){
                EditText tabla_cultivo_2 = (EditText) findViewById(R.id.tabla_cultivo_2);
                EditText tabla_variedad_2 = (EditText) findViewById(R.id.tabla_variedad_2);
                EditText tabla_produccionyear_2 = (EditText) findViewById(R.id.tabla_produccionyear_2);
                EditText tabla_produccionha_2 = (EditText) findViewById(R.id.tabla_produccionha_2);
                EditText tabla_produccionestimada_2 = (EditText) findViewById(R.id.tabla_produccionestimada_2);
                if(tabla_cultivo_2.getText().toString().isEmpty() || tabla_variedad_2.getText().toString().isEmpty() || tabla_produccionyear_2.getText().toString().isEmpty() || tabla_produccionha_2.getText().toString().isEmpty() || tabla_produccionestimada_2.getText().toString().isEmpty()){
                    Toast.makeText(crear_finca_individual.this, "Hemos encontrado datos incompletos en la tabla de cultivos, fila # 2, complételos o elimínelos antes de continuar", Toast.LENGTH_LONG).show();
                    return;
                }
            }

            CheckBox check3 = (CheckBox) findViewById(R.id.check3);
            if(check3.isChecked()){
                EditText tabla_cultivo_3 = (EditText) findViewById(R.id.tabla_cultivo_3);
                EditText tabla_variedad_3 = (EditText) findViewById(R.id.tabla_variedad_3);
                EditText tabla_produccionyear_3 = (EditText) findViewById(R.id.tabla_produccionyear_3);
                EditText tabla_produccionha_3 = (EditText) findViewById(R.id.tabla_produccionha_3);
                EditText tabla_produccionestimada_3 = (EditText) findViewById(R.id.tabla_produccionestimada_3);
                if(tabla_cultivo_3.getText().toString().isEmpty() || tabla_variedad_3.getText().toString().isEmpty() || tabla_produccionyear_3.getText().toString().isEmpty() || tabla_produccionha_3.getText().toString().isEmpty() || tabla_produccionestimada_3.getText().toString().isEmpty()){
                    Toast.makeText(crear_finca_individual.this, "Hemos encontrado datos incompletos en la tabla de cultivos, fila # 3, complételos o elimínelos antes de continuar", Toast.LENGTH_LONG).show();
                    return;
                }
            }

            CheckBox check4 = (CheckBox) findViewById(R.id.check4);
            if(check4.isChecked()){
                EditText tabla_cultivo_4 = (EditText) findViewById(R.id.tabla_cultivo_4);
                EditText tabla_variedad_4 = (EditText) findViewById(R.id.tabla_variedad_4);
                EditText tabla_produccionyear_4 = (EditText) findViewById(R.id.tabla_produccionyear_4);
                EditText tabla_produccionha_4 = (EditText) findViewById(R.id.tabla_produccionha_4);
                EditText tabla_produccionestimada_4 = (EditText) findViewById(R.id.tabla_produccionestimada_4);
                if(tabla_cultivo_4.getText().toString().isEmpty() || tabla_variedad_4.getText().toString().isEmpty() || tabla_produccionyear_4.getText().toString().isEmpty() || tabla_produccionha_4.getText().toString().isEmpty() || tabla_produccionestimada_4.getText().toString().isEmpty()){
                    Toast.makeText(crear_finca_individual.this, "Hemos encontrado datos incompletos en la tabla de cultivos, fila # 4, complételos o elimínelos antes de continuar", Toast.LENGTH_LONG).show();
                    return;
                }
            }

            CheckBox check5 = (CheckBox) findViewById(R.id.check5);
            if(check5.isChecked()){
                EditText tabla_cultivo_5 = (EditText) findViewById(R.id.tabla_cultivo_5);
                EditText tabla_variedad_5 = (EditText) findViewById(R.id.tabla_variedad_5);
                EditText tabla_produccionyear_5 = (EditText) findViewById(R.id.tabla_produccionyear_5);
                EditText tabla_produccionha_5 = (EditText) findViewById(R.id.tabla_produccionha_5);
                EditText tabla_produccionestimada_5 = (EditText) findViewById(R.id.tabla_produccionestimada_5);
                if(tabla_cultivo_5.getText().toString().isEmpty() || tabla_variedad_5.getText().toString().isEmpty() || tabla_produccionyear_5.getText().toString().isEmpty() || tabla_produccionha_5.getText().toString().isEmpty() || tabla_produccionestimada_5.getText().toString().isEmpty()){
                    Toast.makeText(crear_finca_individual.this, "Hemos encontrado datos incompletos en la tabla de cultivos, fila # 5, complételos o elimínelos antes de continuar", Toast.LENGTH_LONG).show();
                    return;
                }
            }
            

            progress = ProgressDialog.show(crear_finca_individual.this, "Información",
                    "Estamos creando la finca, espere un momento.", true);

            sb.append("?nombre=");
            sb.append(nombre.getText().toString());
            sb.append("&ref_finca=");
            sb.append(codigo.getText().toString());
            sb.append("&fecha=");
            String armarFecha = year + "-" + month + "-" + day + " " + hour + ":" + minute + " 0";
            //sb.append(armarFecha);
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            sb.append(date.format(new Date()));
            sb.append("&foto=http://a57.foxnews.com/global.fncstatic.com/static/managed/img/Entertainment/876/493/EllenPage.jpg");
            sb.append("&dpto=");
            sb.append(departamento.getSelectedItemId());
            sb.append("&municipio=");
            sb.append(municipio.getText().toString());
            sb.append("&vereda=");
            sb.append(vereda.getText().toString());
            sb.append("&posicion=SRID%3D4326%3BPOINT(");
            sb.append(longitud.getText().toString());
            sb.append("%20");
            sb.append(latitud.getText().toString());
            sb.append(")&altitud=");
            sb.append(altura.getText().toString());
            sb.append("&propietario=");
            sb.append(propietario.getText().toString());
            sb.append("&racg=");
            sb.append(grupo.getText().toString());
            sb.append("&tipo_auditoria=");
            sb.append((tipo_auditoria.getSelectedItemId() + 1));
            sb.append("&tipo_auditor=");
            sb.append((tipo_auditor.getSelectedItemId() + 1));
            sb.append("&area_finca=");
            sb.append(area_finca.getText().toString());
            sb.append("&area_conser=");
            sb.append(area_conservacion.getText().toString());
            sb.append("&area_infra=");
            sb.append(area_infraestructura.getText().toString());
            sb.append("&per_cosecha=");
            sb.append(periodo_cosecha.getText().toString());
            sb.append("&prod_reg=");
            sb.append(produccion_regional.getText().toString());
            sb.append("&fr_cafe=");
            sb.append(fr_cafe.getText().toString());
            sb.append("&alm_sana=");
            sb.append(almendra_sana.getText().toString());
            sb.append("&prob_cult=");
            sb.append(problemas_sanitarios.getText().toString());
            sb.append("&ntrabper=");
            sb.append(trabajadores_permanentes.getText().toString());
            sb.append("&ntrabtem=");
            sb.append(trabajadores_temporales.getText().toString());
            sb.append("&doc_anex=");
            sb.append(documentos_anexos.getText().toString());
            sb.append("&proveedo=");
            sb.append(proveedores_visitados.getText().toString());
            sb.append("&observ=");
            sb.append(observaciones.getText().toString());

            sb.append("&cliente=");
            Spinner cliente = (Spinner) findViewById(R.id.clientes);
            int posicionCliente = cliente.getSelectedItemPosition();
            Clientes clienteBD = clientes_lista.get(posicionCliente);
            sb.append(clienteBD.getReferencia());
            sb.append("&auditor=");
            katana kata = new katana();
            sb.append(kata.getUserId());

            finca = new Fincas();
            if(grupo.getText().toString().equals("")){
                finca.setTipo_finca(1);
                tipo = 1;
            } else {
                finca.setTipo_finca(2);
                tipo = 2;
            }

            finca.setNombre(nombre.getText().toString());
            finca.setCodigo(codigo.getText().toString());
            finca.setFecha(date.format(new Date()));
            finca.setImagen("http://a57.foxnews.com/global.fncstatic.com/static/managed/img/Entertainment/876/493/EllenPage.jpg");
            finca.setDepartamento(departamento.getSelectedItemId());
            finca.setMunicipio(municipio.getText().toString());
            finca.setVereda(vereda.getText().toString());
            finca.setLongitud(Double.valueOf(longitud.getText().toString()));
            finca.setLatitud(Double.valueOf(latitud.getText().toString()));
            finca.setAltitud(Integer.parseInt(altura.getText().toString()));
            finca.setPropietario(propietario.getText().toString());
            finca.setGrupo(grupo.getText().toString());
            finca.setTipo_auditoria((tipo_auditoria.getSelectedItemId() + 1));
            finca.setTipo_auditor((tipo_auditor.getSelectedItemId() + 1));
            finca.setArea_finca(Integer.parseInt(area_finca.getText().toString()));
            finca.setArea_conservacion(Integer.parseInt(area_conservacion.getText().toString()));
            finca.setArea_infraestructura(Integer.parseInt(area_infraestructura.getText().toString()));
            finca.setPeriodo_cosecha(periodo_cosecha.getText().toString());
            finca.setProduccion_regional(produccion_regional.getText().toString());
            finca.setFr_cafe(Integer.parseInt(fr_cafe.getText().toString()));
            finca.setAlmendra_sana(almendra_sana.getText().toString());
            finca.setProblemas_sanitarios(problemas_sanitarios.getText().toString());
            finca.setDocumentos_anexos(documentos_anexos.getText().toString());
            finca.setProveedores_visitados(proveedores_visitados.getText().toString());
            finca.setTrabajadores_permanentes(Integer.parseInt(trabajadores_permanentes.getText().toString()));
            finca.setTrabajadores_temporales(Integer.parseInt(trabajadores_temporales.getText().toString()));
            finca.setObservaciones(observaciones.getText().toString());
            finca.setIdCliente(clienteBD.getId());
            List<Auditores> auditores = DaoAPP.daoSession.getAuditoresDao().loadAll();
            finca.setIdAuditor(auditores.get(0).getId());

            sb.append(cultivos);

            Log.d("La URL", sb.toString().replace(" ", "%20"));
            new guardarFinca().execute();

        } else {
            Toast.makeText(crear_finca_individual.this, "Diligencie todos los datos antes de guardar la finca.", Toast.LENGTH_SHORT).show();
        }


    }

    /**
     * guardar finca en el administrador
     */
    private class guardarFinca extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {
            return OAuth2Client.token.getResource(OAuth2Client.token, sb.toString().replace(" ", "%20"));
        }

        protected void onPostExecute(String result) {
            if(progress.isShowing())
                progress.dismiss();
            try {
                JSONObject objeto = new JSONObject(result);
                if (objeto.getString("status").equals("OK")) {
                    finca.setRef_finca(objeto.getInt("finca"));
                    finca.setId_formulario(objeto.getInt("formulario"));

                    if(objeto.getString("type").equals("rac")){
                        poblarBD poblar = new poblarBD();
                        poblar.poblar(objeto.getInt("formulario"));
                    } else {
                        poblarBD poblar = new poblarBD();
                        poblar.poblar(objeto.getInt("formulario"), true);
                    }

                    DaoAPP.daoSession.getFincasDao().insert(finca);
                    Toast.makeText(crear_finca_individual.this, "Finca creada correctamente", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(crear_finca_individual.this, "Hubo un error al crear la finca, intentelo de nuevo", Toast.LENGTH_SHORT).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }



    /**
     * Guardar cliente
     */
    private class guardarCliente extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {
            return OAuthUtils.getProtectedResource(OAuth2Client.token, sbp.toString().replace(" ", "%20"));
        }

        protected void onPostExecute(String result) {
            if (result != null) {
                if(progress.isShowing())
                    progress.dismiss();
                try {
                    JSONObject objeto = new JSONObject(result);
                    if (objeto.getString("status").equals("OK")) {
                        Toast.makeText(crear_finca_individual.this, "Cliente creado correctamente", Toast.LENGTH_SHORT).show();
                        cliente.setReferencia(objeto.getInt("client"));
                        DaoAPP.daoSession.getClientesDao().insert(cliente);
                        montarClientes();
                    } else {
                        Toast.makeText(crear_finca_individual.this, "Hubo un error al agregar el cliente", Toast.LENGTH_SHORT).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email)
                .matches();
    }

    public void montarClientes() {
        Spinner clientes_spinner = (Spinner) findViewById(R.id.clientes);
        katana kata = new katana();
        if (kata.checkClientes()) {
            clientes_lista = kata.getClientes();
            List<String> list = new ArrayList<String>();
            for (Clientes adr : clientes_lista) {
                list.add(adr.getNombres() + " " + adr.getApellidos());
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            clientes_spinner.setAdapter(null);
            clientes_spinner.setAdapter(adapter);
        }
    }

    private void hideKeyboard() {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


}
