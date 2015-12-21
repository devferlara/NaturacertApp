package naturacert.baumsoft.dev.naturacert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class seleccionar_categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_categoria);

        ImageView ras = (ImageView) findViewById(R.id.ras);
        ImageView flor = (ImageView) findViewById(R.id.flor);

        ras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar = new Intent(seleccionar_categoria.this, iniciorac.class);
                startActivity(pasar);
            }
        });

        flor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar = new Intent(seleccionar_categoria.this, inicioflor.class);
                startActivity(pasar);
            }
        });

    }

}
