package naturacert.baumsoft.dev.naturacert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;
import naturacert.baumsoft.dev.naturacert.extras.adapter_fincas;


public class mis_fincas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_mis_fincas);

        List<Fincas> fincas = DaoAPP.daoSession.getFincasDao().loadAll();

        ListView lista = (ListView) findViewById(R.id.lista);

        if(fincas.size()!=0){
            lista.setAdapter(null);
            lista.setAdapter(new adapter_fincas(mis_fincas.this, fincas, mis_fincas.this));
        }

        Button buscar = (Button) findViewById(R.id.buscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText texto_busqueda = (EditText) findViewById(R.id.texto_buscar);
                String texto = texto_busqueda.getText().toString();
                QueryBuilder qb = DaoAPP.daoSession.getFincasDao().queryBuilder();
                qb.whereOr(FincasDao.Properties.Nombre.like(texto), FincasDao.Properties.Municipio.like(texto), FincasDao.Properties.Vereda.like(texto), FincasDao.Properties.Grupo.like(texto), FincasDao.Properties.Codigo.like(texto));

                ListView lista = (ListView) findViewById(R.id.lista);
                List fincas = qb.list();
                if(fincas.size() != 0){
                    lista.setAdapter(null);
                    lista.setAdapter(new adapter_fincas(mis_fincas.this, fincas, mis_fincas.this));
                }

            }
        });
    }

    public void abrir_formulario(int id){
        Intent pasar = new Intent(mis_fincas.this, formularioracindividual.class);
        pasar.putExtra("id_formulario", String.valueOf(id));
        startActivity(pasar);
    }

}
