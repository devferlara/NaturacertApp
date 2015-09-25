package naturacert.baumsoft.dev.naturacert;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import naturacert.baumsoft.dev.naturacert.extras.katana;


public class formularioracgrupal extends ActionBarActivity {

    ViewPager pager;
    ViewPagerAdapterRG adapter = null;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"1.1", "1.2", "1.3", "1.4", "2.1", "2.2", "2.3", "3.1", "3.2", "3.3", "3.4", "3.5", "3.6", "3.7", "3.8", "3.9"};
    int Numboftabs = 16;

    Button principio1;
    Button principio2;
    Button principio3;

    TextView label_principio;
    TextView numero_principio;
    private String[] principios = new String[5];

    int formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularioracgrupal);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        Intent mIntent = getIntent();
        formulario = Integer.parseInt(mIntent.getStringExtra("id_formulario"));

        adapter = new ViewPagerAdapterRG(getSupportFragmentManager(), Titles, Numboftabs, getApplication(), formulario);

        toolbar.setVisibility(View.GONE);

        katana kata = new katana();
        String[] datos = kata.informacionAuditor();

        TextView nombre_auditor = (TextView) findViewById(R.id.nombre_auditor);
        nombre_auditor.setText(datos[0] + " " + datos[1]);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return R.color.material_blue_grey_950;
            }
        });
        tabs.setViewPager(pager);

        principio1 = (Button) findViewById(R.id.principio1);
        principio2 = (Button) findViewById(R.id.principio2);
        principio3 = (Button) findViewById(R.id.principio3);

        ImageButton ayuda = (ImageButton) findViewById(R.id.ayuda);
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(formularioracgrupal.this, recomendaciones.class);
                startActivity(pasar);
            }
        });

        ImageButton terminar = (ImageButton) findViewById(R.id.terminar);
        terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.popup_subir, null);
                final AlertDialog constructor = new AlertDialog.Builder(formularioracgrupal.this).create();
                constructor.setView(dialoglayout);
                constructor.show();
                constructor.setCancelable(true);

                Button cancelar = (Button) dialoglayout.findViewById(R.id.cancelar);
                cancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        constructor.dismiss();
                    }
                });

                Button aceptar = (Button) dialoglayout.findViewById(R.id.aceptar);
                aceptar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        constructor.dismiss();
                        finish();
                        Toast.makeText(formularioracgrupal.this, "Formulario guardado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        label_principio = (TextView) findViewById(R.id.nombre_principio_label);
        numero_principio = (TextView) findViewById(R.id.principio_label);

        principios[0] = "none";
        principios[1] = "Capacitación";
        principios[2] = "Evaluación de Riesgo";
        principios[3] = "Sistema de Gestión";

        principio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(0);
                seleccionarPrincipio(principio1, 1);
            }
        });
        principio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(3);
                seleccionarPrincipio(principio2, 2);
            }
        });
        principio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(7);
                seleccionarPrincipio(principio3, 3);
            }
        });

    }

    public void actualizarTab(int tab){

        if( tab <= 3 ){
            seleccionarPrincipio(principio1, 1);
        }
        if( tab >= 4 && tab <= 7 ){
            seleccionarPrincipio(principio2, 2);
        }
        if( tab >= 8  ){
            seleccionarPrincipio(principio3, 3);
        }

    }

    private void seleccionarPrincipio(Button escogido, int principio) {
        principio1.setBackgroundColor(Color.parseColor("#ffffff"));
        principio2.setBackgroundColor(Color.parseColor("#ffffff"));
        principio3.setBackgroundColor(Color.parseColor("#ffffff"));

        escogido.setBackgroundColor(Color.parseColor("#cccccc"));

        label_principio.setText(principios[principio]);
        numero_principio.setText("Principio " + principio);
    }

    public void exp(String datos){
        TextView reporte = (TextView) findViewById(R.id.reporte);
        reporte.setText(datos);
    }


}
