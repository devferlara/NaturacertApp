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


public class formularioflorindividual extends ActionBarActivity {

    ViewPager pager;
    ViewPagerAdapterFlor adapter = null;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9"};
    int Numboftabs = 9;

    Button principio1;
    Button principio2;
    Button principio3;
    Button principio4;
    Button principio5;
    Button principio6;
    Button principio7;
    Button principio8;
    Button principio9;
    Button principio10;

    TextView label_principio;
    TextView numero_principio;
    private String[] principios = new String[21];

    int formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_formularioflorindividual);

        Intent mIntent = getIntent();
        formulario = Integer.parseInt(mIntent.getStringExtra("id_formulario"));

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        adapter = new ViewPagerAdapterFlor(getSupportFragmentManager(), Titles, Numboftabs, getApplication(), formulario);

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

        ImageButton ayuda = (ImageButton) findViewById(R.id.ayuda);
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(formularioflorindividual.this, recomendaciones.class);
                startActivity(pasar);
            }
        });

        ImageButton terminar = (ImageButton) findViewById(R.id.terminar);
        terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.popup_subir, null);
                final AlertDialog constructor = new AlertDialog.Builder(formularioflorindividual.this).create();
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
                        Toast.makeText(formularioflorindividual.this, "Formulario guardado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        principio1 = (Button) findViewById(R.id.principio1);
        principio2 = (Button) findViewById(R.id.principio2);
        principio3 = (Button) findViewById(R.id.principio3);
        principio4 = (Button) findViewById(R.id.principio4);
        principio5 = (Button) findViewById(R.id.principio5);
        principio6 = (Button) findViewById(R.id.principio6);
        principio7 = (Button) findViewById(R.id.principio7);
        principio8 = (Button) findViewById(R.id.principio8);
        principio9 = (Button) findViewById(R.id.principio9);
        principio10 = (Button) findViewById(R.id.principio10);

        label_principio = (TextView) findViewById(R.id.nombre_principio_label);
        numero_principio = (TextView) findViewById(R.id.principio_label);

        principio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(0);
                seleccionarPrincipio(principio1, 1);
            }
        });

        /*
        principio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(11);
                seleccionarPrincipio(principio2, 2);
            }
        });
        principio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(20);
                seleccionarPrincipio(principio3, 3);
            }
        });
        principio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(26);
                seleccionarPrincipio(principio4, 4);
            }
        });
        principio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(35);
                seleccionarPrincipio(principio5, 5);
            }
        });
        principio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(54);
                seleccionarPrincipio(principio6, 6);
            }
        });
        principio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(74);
                seleccionarPrincipio(principio7, 7);
            }
        });
        principio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(80);
                seleccionarPrincipio(principio8, 8);
            }
        });
        principio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(89);
                seleccionarPrincipio(principio9, 9);
            }
        });
        principio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(94);
                seleccionarPrincipio(principio10, 10);
            }
        });

        */

        principios[0] = "none";
        principios[1] = "Sistema de Gestion Social y Ambiental";
        principios[2] = "Conservación de Ecosistemas";
        principios[3] = "Proteccion de la Vida Silvestre";
        principios[4] = "Conservación de Recursos Hídricos";
        principios[5] = "Trato Justo y Buenas Condiciones para los Trabajadores";
        principios[6] = "Salud y Seguridad Ocupacional";
        principios[7] = "Relaciones con la Comunidad";
        principios[8] = "Manejo Integrado del Cultivo";
        principios[9] = "Manejo y Conservación del Suelo";
        principios[10] = "Manejo Integrado de Desechos";

    }

    public void actualizarTab(int tab){

        if( tab <= 10 ){
            seleccionarPrincipio(principio1, 1);
        }
        if( tab >= 11 && tab <= 19 ){
            seleccionarPrincipio(principio2, 2);
        }
        if( tab >= 20 && tab <= 25 ){
            seleccionarPrincipio(principio3, 3);
        }
        if( tab >= 26 && tab <= 34 ){
            seleccionarPrincipio(principio4, 4);
        }
        if( tab >= 35 && tab <= 53 ){
            seleccionarPrincipio(principio5, 5);
        }
        if( tab >= 54 && tab <= 73 ){
            seleccionarPrincipio(principio6, 6);
        }
        if( tab >= 74 && tab <= 79 ){
            seleccionarPrincipio(principio7, 7);
        }
        if( tab >= 80 && tab <= 88 ){
            seleccionarPrincipio(principio8, 8);
        }
        if( tab >= 89 && tab <= 93 ){
            seleccionarPrincipio(principio9, 9);
        }
        if( tab >= 94 ){
            seleccionarPrincipio(principio10, 10);
        }

    }



    private void seleccionarPrincipio(Button escogido, int principio) {
        principio1.setBackgroundColor(Color.parseColor("#ffffff"));
        principio2.setBackgroundColor(Color.parseColor("#ffffff"));
        principio3.setBackgroundColor(Color.parseColor("#ffffff"));
        principio4.setBackgroundColor(Color.parseColor("#ffffff"));
        principio5.setBackgroundColor(Color.parseColor("#ffffff"));
        principio6.setBackgroundColor(Color.parseColor("#ffffff"));
        principio7.setBackgroundColor(Color.parseColor("#ffffff"));
        principio8.setBackgroundColor(Color.parseColor("#ffffff"));
        principio9.setBackgroundColor(Color.parseColor("#ffffff"));
        principio10.setBackgroundColor(Color.parseColor("#ffffff"));

        escogido.setBackgroundColor(Color.parseColor("#cccccc"));

        label_principio.setText(principios[principio]);
        numero_principio.setText("Principio " + principio);
    }

    public void exp(String datos){
        TextView reporte = (TextView) findViewById(R.id.reporte);
        reporte.setText(datos);
    }

}
