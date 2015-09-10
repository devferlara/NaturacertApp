package naturacert.baumsoft.dev.naturacert.extras;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import naturacert.baumsoft.dev.naturacert.Fincas;
import naturacert.baumsoft.dev.naturacert.R;

/**
 * Created by imac on 9/9/15.
 */
public class adapter_fincas extends BaseAdapter {

    private Activity activity;
    private List<Fincas> acv;

    public adapter_fincas(Activity activity, List<Fincas> acv) {
        this.activity = activity;
        this.acv = acv;
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

            //Typeface poor = Typeface.createFromAsset(activity.getAssets(), "fonts/poor.ttf");

            //TextView nombre = (TextView) convertView.findViewById(R.id.nombreconcatenado);



        }
        return convertView;
    }


}
