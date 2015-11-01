package naturacert.baumsoft.dev.naturacert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

        TextView nombre_auditor = (TextView) findViewById(R.id.nombre_auditor);
        nombre_auditor.setText(datosAuditor[0] + " " + datosAuditor[1]);

        Toast.makeText(iniciorac.this, "Bienvenido " + datosAuditor[0] + " " + datosAuditor[1], Toast.LENGTH_SHORT).show();

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
                pasar.putExtra("tipo", "1");
                startActivity(pasar);
            }
        });

        grupal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(iniciorac.this, crear_finca_individual.class);
                pasar.putExtra("tipo", "2");
                startActivity(pasar);
            }
        });

        LinearLayout cerrar = (LinearLayout) findViewById(R.id.cerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
            }
        });

        LinearLayout actualizar = (LinearLayout) findViewById(R.id.actualizar);
        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
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
                        4000);*/
            }

        });
    }


}