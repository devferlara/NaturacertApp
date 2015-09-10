package naturacert.baumsoft.dev.naturacert;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import naturacert.baumsoft.dev.naturacert.extras.katana;


public class iniciorac extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_iniciorac);

        katana kata = new katana();
        String[] datosAuditor;
        datosAuditor = kata.informacionAuditor();

        Toast.makeText(iniciorac.this, "Bienvenido" + datosAuditor[0] + " " + datosAuditor[1], Toast.LENGTH_SHORT).show();

        TextView nombre_auditor = (TextView) findViewById(R.id.nombre_auditor);
        nombre_auditor.setText(datosAuditor[0] + " " + datosAuditor[1]);

        Log.d("Foto", datosAuditor[2]);
        ImageView imagen_auditor = (ImageView) findViewById(R.id.foto_auditor);
        imagen_auditor.setTag("http://vignette3.wikia.nocookie.net/penguinsofmadagascar/images/0/00/Private.gif");
        new DownloadImagesTask().execute(imagen_auditor);

        LinearLayout finca = (LinearLayout) findViewById(R.id.finca);

        finca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(iniciorac.this, mis_fincas.class);
                startActivity(pasar);
            }
        });

        ImageView individual = (ImageView) findViewById(R.id.individual);
        ImageView grupal = (ImageView) findViewById(R.id.grupal);

        individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(iniciorac.this, crear_finca_individual.class);
                startActivity(pasar);
            }
        });

        grupal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(iniciorac.this, formularioracgrupal.class);
                startActivity(pasar);
            }
        });

        LinearLayout cerrar = (LinearLayout) findViewById(R.id.cerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LinearLayout actualizar = (LinearLayout) findViewById(R.id.actualizar);
        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotateAnimation anim = new RotateAnimation(0f, 350f, 24f, 24f);
                anim.setInterpolator(new LinearInterpolator());
                anim.setRepeatCount(Animation.INFINITE);
                anim.setDuration(900);

                final ImageView splash = (ImageView) findViewById(R.id.rotar);
                splash.startAnimation(anim);

                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                splash.setAnimation(null);
                                Toast.makeText(iniciorac.this, "La aplicación se ha sincronizado correctamente con el servidor.", Toast.LENGTH_LONG).show();
                            }
                        },
                        4000);
            }
        });
    }


    public class DownloadImagesTask extends AsyncTask<ImageView, Void, Bitmap> {

        ImageView imageView = null;

        @Override
        protected Bitmap doInBackground(ImageView... imageViews) {
            this.imageView = imageViews[0];
            return download_Image((String)imageView.getTag());
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }

        private Bitmap download_Image(String url) {

            Bitmap bmp =null;
            try{
                URL ulrn = new URL(url);
                HttpURLConnection con = (HttpURLConnection)ulrn.openConnection();
                InputStream is = con.getInputStream();
                bmp = BitmapFactory.decodeStream(is);
                if (null != bmp)
                    return bmp;

            }catch(Exception e){}
            return bmp;
        }
    }

}