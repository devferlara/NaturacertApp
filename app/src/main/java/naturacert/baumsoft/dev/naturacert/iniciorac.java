package naturacert.baumsoft.dev.naturacert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class iniciorac extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_iniciorac);

        Toast.makeText(iniciorac.this, "Bienvenido Diego Fernando Lara", Toast.LENGTH_SHORT).show();

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
}
