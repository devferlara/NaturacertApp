package naturacert.baumsoft.dev.naturacert.extras;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import naturacert.baumsoft.dev.naturacert.Fincas;
import naturacert.baumsoft.dev.naturacert.R;
import naturacert.baumsoft.dev.naturacert.mis_fincas;

/**
 * Created by imac on 9/9/15.
 */
public class adapter_fincas extends BaseAdapter {

    private Activity activity;
    private List<Fincas> acv;
    Context contexto;

    public adapter_fincas(Activity activity, List<Fincas> acv, Context contexto) {
        this.activity = activity;
        this.acv = acv;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return this.acv.size();
    }

    @Override
    public Object getItem(int position) {
        return this.acv.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflator = activity.getLayoutInflater();
            convertView = inflator.inflate(R.layout.lista_fincas, null);
            // obtenemos los datos
            final Fincas mcv = acv.get(position);

            ImageView imagen = (ImageView) convertView.findViewById(R.id.imagen);
            if(mcv.getTipo_finca() == 1){
                imagen.setBackgroundResource(R.drawable.racmisfincasiconouno);
            } else {
                imagen.setBackgroundResource(R.drawable.racmisfincasiconodos);
            }

            TextView nombre_finca = (TextView) convertView.findViewById(R.id.nombre_finca);
            nombre_finca.setText(mcv.getNombre());

            TextView codigo_finca = (TextView) convertView.findViewById(R.id.codigo_finca);
            codigo_finca.setText(mcv.getCodigo());

            TextView nombre_cliente = (TextView) convertView.findViewById(R.id.nombre_cliente);
            nombre_cliente.setText(mcv.getClientes().getNombres() + " " + mcv.getClientes().getApellidos());

            TextView fecha_agregado = (TextView) convertView.findViewById(R.id.fecha_agregado);
            fecha_agregado.setText(mcv.getFecha());

            TextView vereda = (TextView) convertView.findViewById(R.id.vereda);
            vereda.setText(mcv.getVereda());

            Log.d("EL id a pasar es", "-" + mcv.getId_formulario());

            final Button formulario = (Button) convertView.findViewById(R.id.formulario);
            formulario.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((mis_fincas)activity).abrir_formulario(mcv.getId_formulario());
                }
            });

            //Typeface poor = Typeface.createFromAsset(activity.getAssets(), "fonts/poor.ttf");

            //TextView nombre = (TextView) convertView.findViewById(R.id.nombreconcatenado);



        }
        return convertView;
    }


}
