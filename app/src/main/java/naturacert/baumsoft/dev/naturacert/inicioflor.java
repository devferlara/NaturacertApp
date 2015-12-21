package naturacert.baumsoft.dev.naturacert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class inicioflor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioflor);

        ImageView formulario = (ImageView) findViewById(R.id.individual);
        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar = new Intent(inicioflor.this, formularioflorindividual.class);
                pasar.putExtra("id_formulario", "5");
                startActivity(pasar);
            }
        });


    }

}
