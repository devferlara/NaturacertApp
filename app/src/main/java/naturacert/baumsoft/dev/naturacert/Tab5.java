package naturacert.baumsoft.dev.naturacert;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import naturacert.baumsoft.dev.naturacert.extras.others;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab5 extends Fragment {

    private final JSONArray jsonDatos = new JSONArray();
    private LinearLayout contenedorInformativas;
    private String json;
    private int numeroPregunta;
    private int numeroCadenaPregunta;
    private View v;
    private int rtaMaestra;
    private int numeroMaestras;
    private long idUno;
    private int origen;
    private int formulario;
    private String observaciones_cadena;
    private Boolean critico;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Evento", "oncreate flor");
        numeroPregunta = 0;
        numeroCadenaPregunta = 2;
        numeroMaestras = 1;
        rtaMaestra = 1;
        idUno = 1;
    }

    private void escogerOrigen(Button botonEscogido, Button boton1, Button boton2) {
        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioorigen);
        boton1.setBackgroundResource(R.drawable.estilosbotonformularioorigen);
        boton2.setBackgroundResource(R.drawable.estilosbotonformularioorigen);
        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioorigenseleccionado);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.tab_demo, container, false);
        final Context contexto = (getActivity());

        new others();
        String palabras = others.leerArchivoFlor(json + ".json", getActivity());

        try {

            //cargarBD(contexto);

            JSONObject objeto = new JSONObject(palabras);

            /* empezamos a grabar los quemados */
            TextView punto = (TextView) v.findViewById(R.id.punto);
            punto.setText(objeto.getString("punto"));

            /* entramos a la parte maestra */
            final JSONObject maestra = new JSONObject(objeto.getString("maestra"));
            TextView tituloMaestra = (TextView) v.findViewById(R.id.titulo_pregunta_maestra);

            tituloMaestra.setText(maestra.getString("pregunta"));

            contenedorInformativas = (LinearLayout) v.findViewById(R.id.contenedor_respuestas_informativas);

            //Pregunta maestra
            JSONObject infor = new JSONObject(objeto.getString("informativas"));
            JSONArray informativas = infor.getJSONArray("respuestas");

            LinearLayout equivalencias = (LinearLayout) v.findViewById(R.id.equivalencias);

            TextView equiv = (TextView) v.findViewById(R.id.equiv);
            equiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    LayoutInflater inflater = getActivity().getLayoutInflater();
                    final View dialoglayout = inflater.inflate(R.layout.layout_equivalencias, null);
                    final AlertDialog constructor = new AlertDialog.Builder(getActivity()).create();
                    constructor.setView(dialoglayout);
                    constructor.show();
                    constructor.setCancelable(true);

                    /*
                    final EditText obser_caja = (EditText) dialoglayout.findViewById(R.id.editText);
                    obser_caja.setText(observaciones_cadena);

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
                            observaciones_cadena = obser_caja.getText().toString();
                            constructor.dismiss();
                        }
                    });*/

                    TextView texto = (TextView) dialoglayout.findViewById(R.id.texto);
                    TextView titulo = (TextView) dialoglayout.findViewById(R.id.titulo);

                    try {
                        texto.setText(maestra.getString("texto"));
                        String concatenar = "Equivalencia RAC " + maestra.getString("equivalencia");
                        titulo.setText(concatenar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            });

            String equivalencias_string = maestra.getString("equivalencia");
            if (!equivalencias_string.equals("0")) {
                String[] array = equivalencias_string.split(",", -1);

                for (int f = 0; f < array.length; f++) {

                    TextView titulo = new TextView(getActivity());
                    LinearLayout.LayoutParams TVPreguntaParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    TVPreguntaParams.setMargins(0, 5, 0, 5);
                    titulo.setText(array[f]);
                    titulo.setPadding(15, 15, 15, 15);
                    titulo.setLayoutParams(TVPreguntaParams);
                    titulo.setTextColor(Color.BLACK);
                    titulo.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);

                    equivalencias.addView(titulo);

                }

                Log.d("Largo de array es ", "- " + array.length);
            } else {

                TextView titulo = new TextView(getActivity());
                LinearLayout.LayoutParams TVPreguntaParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                TVPreguntaParams.setMargins(0, 5, 0, 5);
                titulo.setText("No");
                titulo.setPadding(15, 15, 15, 15);
                titulo.setLayoutParams(TVPreguntaParams);
                titulo.setTextColor(Color.BLACK);
                titulo.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);

                equivalencias.addView(titulo);

                TextView equiv2 = (TextView) v.findViewById(R.id.equiv);
                equiv2.setVisibility(View.GONE);

            }


            LinearLayout LL2 = new LinearLayout(getActivity());
            LL2.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams LLParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            LLParams2.gravity = Gravity.CENTER_HORIZONTAL;
            LL2.setLayoutParams(LLParams2);

            TextView tituloPreguntaInformativa = new TextView(getActivity());
            LinearLayout.LayoutParams TVPreguntaInformativaParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            TVPreguntaInformativaParams.setMargins(0, 0, 0, 40);
            TVPreguntaInformativaParams.gravity = Gravity.LEFT;
            tituloPreguntaInformativa.setText(infor.getString("principal"));
            tituloPreguntaInformativa.setTextColor(Color.BLACK);
            tituloPreguntaInformativa.setLayoutParams(TVPreguntaInformativaParams);
            tituloPreguntaInformativa.setTextSize(TypedValue.COMPLEX_UNIT_PX, 18);

            LL2.addView(tituloPreguntaInformativa);
            contenedorInformativas.addView(LL2);


            for (int i = 0; i < informativas.length(); i++) {

                String seccion = informativas.getString(i);


                LinearLayout LL = new LinearLayout(getActivity());
                LL.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams LLParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                LLParams.gravity = Gravity.CENTER_HORIZONTAL;
                LL.setLayoutParams(LLParams);

                if (!seccion.equals("null")) {
                    TextView tituloPreguntaInformativa2 = new TextView(getActivity());
                    LinearLayout.LayoutParams TVPreguntaInformativaParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    TVPreguntaInformativaParams2.setMargins(0, 0, 0, 10);
                    TVPreguntaInformativaParams2.gravity = Gravity.LEFT;
                    tituloPreguntaInformativa2.setText(seccion);
                    tituloPreguntaInformativa2.setTextColor(Color.BLACK);
                    tituloPreguntaInformativa2.setLayoutParams(TVPreguntaInformativaParams2);
                    tituloPreguntaInformativa2.setTextSize(TypedValue.COMPLEX_UNIT_PX, 18);

                    LL.addView(tituloPreguntaInformativa2);
                }

                contenedorInformativas.addView(LL);



            }

            /*
            for (int i = 0; i < informativas.length(); i++) {

                JSONObject seccion = new JSONObject(informativas.getString(i));
                //Log.d("Seccion", seccion.toString());


                LinearLayout LL = new LinearLayout(getActivity());
                LL.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams LLParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                LLParams.gravity = Gravity.CENTER_HORIZONTAL;
                LL.setLayoutParams(LLParams);

                TextView titulo = new TextView(getActivity());
                LinearLayout.LayoutParams TVPreguntaParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                TVPreguntaParams.gravity = Gravity.CENTER_HORIZONTAL;
                titulo.setText(seccion.getString("nombre-pregunta"));
                titulo.setLayoutParams(TVPreguntaParams);
                titulo.setTextColor(Color.BLACK);
                titulo.setTextSize(TypedValue.COMPLEX_UNIT_PX, 18);
                titulo.setTextColor(Color.parseColor("#cccccc"));
                titulo.setTypeface(null, Typeface.BOLD);


                LinearLayout LLH = new LinearLayout(getActivity());
                LLH.setOrientation(LinearLayout.HORIZONTAL);
                LLH.setGravity(Gravity.CENTER_HORIZONTAL);
                LinearLayout.LayoutParams LLHParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                LLHParams.gravity = Gravity.CENTER;
                LLH.setLayoutParams(LLHParams);


                if (seccion.getString("orientacion").equals("h")) {
                    LLH.setOrientation(LinearLayout.HORIZONTAL);
                } else {
                    LLH.setOrientation(LinearLayout.VERTICAL);
                }

                JSONArray internas = seccion.getJSONArray("internas");
                for (int j = 0; j < internas.length(); j++) {

                    JSONObject preguntaSimple = new JSONObject(internas.getString(j));


                    LinearLayout LLI = new LinearLayout(getActivity());
                    LLI.setOrientation(LinearLayout.HORIZONTAL);
                    LLI.setGravity(Gravity.CENTER_HORIZONTAL);

                    LinearLayout.LayoutParams LLIParams;

                    if (seccion.getString("orientacion").equals("h")) {
                        LLIParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    } else {
                        LLIParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    }

                    LLIParams.gravity = Gravity.CENTER;
                    LLI.setLayoutParams(LLIParams);


                    TextView tituloPreguntaInformativa = new TextView(getActivity());
                    LinearLayout.LayoutParams TVPreguntaInformativaParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    TVPreguntaInformativaParams.gravity = Gravity.CENTER;
                    tituloPreguntaInformativa.setText(preguntaSimple.getString("titulo"));
                    tituloPreguntaInformativa.setTextColor(Color.BLACK);
                    tituloPreguntaInformativa.setLayoutParams(TVPreguntaInformativaParams);
                    tituloPreguntaInformativa.setTextSize(TypedValue.COMPLEX_UNIT_PX, 18);


                    LLI.addView(tituloPreguntaInformativa);


                    if (preguntaSimple.getInt("tipo") == 0) {

                        final ToggleButton togglePreguntaInformativa = new ToggleButton(contexto);
                        LinearLayout.LayoutParams paramsPreguntaToggle = new LinearLayout.LayoutParams(45, 45);
                        if (seccion.getString("orientacion").equals("h")) {
                            paramsPreguntaToggle.setMargins(10, 10, 40, 10);
                        } else {
                            paramsPreguntaToggle.setMargins(10, 10, 10, 10);
                        }
                        numeroPregunta++;
                        togglePreguntaInformativa.setLayoutParams(paramsPreguntaToggle);
                        togglePreguntaInformativa.setTextOn("Si");
                        togglePreguntaInformativa.setTextOff("No");
                        togglePreguntaInformativa.setText("No");
                        togglePreguntaInformativa.setTag(0);
                        togglePreguntaInformativa.setId(numeroPregunta);
                        togglePreguntaInformativa.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (togglePreguntaInformativa.getText().equals("No")) {
                                    togglePreguntaInformativa.setTag(1);
                                } else {
                                    togglePreguntaInformativa.setTag(2);
                                }
                                guardar(contexto);
                            }
                        });

                        togglePreguntaInformativa.setBackground(getResources().getDrawable(R.drawable.estilosbotonformularioprincipal));
                        togglePreguntaInformativa.setTextSize(TypedValue.COMPLEX_UNIT_PX, 16);

                        LLI.addView(togglePreguntaInformativa);
                    }

                    if (preguntaSimple.getInt("tipo") == 1) {

                        final Button botonPreguntaInformativa = new Button(contexto);
                        LinearLayout.LayoutParams paramsPreguntaBoton = new LinearLayout.LayoutParams(45, 45);
                        if (seccion.getString("orientacion").equals("h")) {
                            paramsPreguntaBoton.setMargins(10, 10, 40, 10);
                        } else {
                            paramsPreguntaBoton.setMargins(10, 10, 10, 10);
                        }
                        numeroPregunta++;

                        //Log.d("comp" + json, String.valueOf(numeroPregunta)+ "-" + jsonDatos.getString(numeroPregunta));

                        botonPreguntaInformativa.setLayoutParams(paramsPreguntaBoton);
                        botonPreguntaInformativa.setTextColor(Color.WHITE);
                        botonPreguntaInformativa.setBackground(getResources().getDrawable(R.drawable.estilosbotonformularioprincipal));
                        botonPreguntaInformativa.setId(numeroPregunta);
                        botonPreguntaInformativa.setTag(jsonDatos.getInt(numeroPregunta));

                        if (botonPreguntaInformativa.getTag() == 1) {
                            botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnsi);
                            botonPreguntaInformativa.setText("Si");
                        }

                        if (botonPreguntaInformativa.getTag() == 2) {
                            botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnno);
                            botonPreguntaInformativa.setText("No");
                        }

                        if (botonPreguntaInformativa.getTag() == 3) {
                            botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnna);
                            botonPreguntaInformativa.setText("NA");
                        }


                        botonPreguntaInformativa.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                if (botonPreguntaInformativa.getTag() == 1) {
                                    botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnno);
                                    botonPreguntaInformativa.setTag(2);
                                    botonPreguntaInformativa.setText("No");
                                    guardar(contexto);
                                    return;
                                }

                                if (botonPreguntaInformativa.getTag() == 2) {
                                    botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnna);
                                    botonPreguntaInformativa.setTag(3);
                                    botonPreguntaInformativa.setText("NA");
                                    guardar(contexto);
                                    return;
                                }

                                if (botonPreguntaInformativa.getTag() == 3) {
                                    botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnsi);
                                    botonPreguntaInformativa.setTag(1);
                                    botonPreguntaInformativa.setText("Si");
                                    guardar(contexto);
                                    return;
                                }

                                if (botonPreguntaInformativa.getTag() == 9) {
                                    botonPreguntaInformativa.setBackgroundResource(R.drawable.btnmnsi);
                                    botonPreguntaInformativa.setTag(1);
                                    botonPreguntaInformativa.setText("Si");
                                    guardar(contexto);
                                    return;
                                }

                            }
                        });

                        botonPreguntaInformativa.setTextSize(TypedValue.COMPLEX_UNIT_PX, 16);
                        LLI.addView(botonPreguntaInformativa);
                    }

                    if (preguntaSimple.getInt("tipo") == 2) {
                        EditText inputPreguntaInformativa = new EditText(contexto);
                        LinearLayout.LayoutParams paramsPreguntaInput = new LinearLayout.LayoutParams(200, 45);
                        if (seccion.getString("orientacion").equals("h")) {
                            paramsPreguntaInput.setMargins(10, 10, 40, 10);
                        } else {
                            paramsPreguntaInput.setMargins(10, 10, 10, 10);
                        }
                        numeroCadenaPregunta++;
                        numeroPregunta++;
                        inputPreguntaInformativa.setLayoutParams(paramsPreguntaInput);
                        inputPreguntaInformativa.setId(numeroPregunta);
                        inputPreguntaInformativa.setSingleLine();
                        inputPreguntaInformativa.setBackground(getResources().getDrawable(R.drawable.estilosedittextinicio));
                        inputPreguntaInformativa.setTextSize(TypedValue.COMPLEX_UNIT_PX, 16);

                        if (jsonDatos.getString(numeroPregunta).equals("9") || jsonDatos.getString(numeroPregunta).equals("%20")) {
                            inputPreguntaInformativa.setText(" ");
                        } else {
                            inputPreguntaInformativa.setText(jsonDatos.getString(numeroPregunta));
                        }

                        LLI.addView(inputPreguntaInformativa);
                    }

                    LLH.addView(LLI);

                }

                if (!seccion.getString("nombre-pregunta").equals("")) {
                    LL.addView(titulo);
                }
                contenedorInformativas.addView(LL);
                contenedorInformativas.addView(LLH);

                LinearLayout rayaDivisoria = crearRayaVerde(getActivity());
                contenedorInformativas.addView(rayaDivisoria);


            }
            */

            /* asociamos los puntos de origen */
            final Button btnMainD = (Button) v.findViewById(R.id.btnMainD);
            final Button btnMainE = (Button) v.findViewById(R.id.btnMainE);
            final Button btnMainO = (Button) v.findViewById(R.id.btnMainO);


            btnMainD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    escogerOrigen(btnMainD, btnMainE, btnMainO);
                    origen = 1;

                }
            });

            btnMainE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    escogerOrigen(btnMainE, btnMainD, btnMainO);
                    origen = 2;

                }
            });

            btnMainO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    escogerOrigen(btnMainO, btnMainE, btnMainD);
                    origen = 3;

                }
            });


            final Button btnS = (Button) v.findViewById(R.id.btnS);
            final Button btnN = (Button) v.findViewById(R.id.btnN);
            final Button btnNA = (Button) v.findViewById(R.id.btnNA);


            btnS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnS.setBackgroundResource(R.drawable.btnmnsi);
                    btnN.setBackgroundResource(R.drawable.btnmnnone);
                    btnNA.setBackgroundResource(R.drawable.btnmnnone);
                }
            });

            btnN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnS.setBackgroundResource(R.drawable.btnmnnone);
                    btnN.setBackgroundResource(R.drawable.btnrojo);
                    btnNA.setBackgroundResource(R.drawable.btnmnnone);
                }
            });

            btnNA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnS.setBackgroundResource(R.drawable.btnmnnone);
                    btnN.setBackgroundResource(R.drawable.btnmnnone);
                    btnNA.setBackgroundResource(R.drawable.btngris);
                }
            });


            /*
            ImageButton observaciones = (ImageButton) v.findViewById(R.id.observaciones);
            observaciones.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    LayoutInflater inflater = getActivity().getLayoutInflater();
                    final View dialoglayout = inflater.inflate(R.layout.layout_observaciones, null);
                    final AlertDialog constructor = new AlertDialog.Builder(getActivity()).create();
                    constructor.setView(dialoglayout);
                    constructor.show();
                    constructor.setCancelable(true);

                    final EditText obser_caja = (EditText) dialoglayout.findViewById(R.id.editText);
                    obser_caja.setText(observaciones_cadena);

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
                            observaciones_cadena = obser_caja.getText().toString();
                            constructor.dismiss();
                        }
                    });

                }
            });
            */


            LinearLayout ocultarTeclado = (LinearLayout) v.findViewById(R.id.ocultar_teclado);
            ocultarTeclado.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hideKeyboard();
                }
            });

            LinearLayout ocultarTeclado2 = (LinearLayout) v.findViewById(R.id.respuestas_maestras);
            ocultarTeclado2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hideKeyboard();
                }
            });

            /* entramos a la parte maestra */


            /* empezamos a grabar los quemados */

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return v;
    }

    public void guardar(Context contexto) {

        /*

        if (numeroPregunta != 0) {
            int[] datosEnviar = new int[numeroPregunta + 2];
            String[] cadenaEnviar = new String[numeroCadenaPregunta + 1];
            int contadorTexto = 0;
            datosEnviar[0] = rtaMaestra;
            int finalInt = 0;
            int finalString = 0;

            for (int p = 1; p <= numeroPregunta; p++) {

                String idCadena = String.valueOf(p);
                int id = getResources().getIdentifier(idCadena, "id", contexto.getPackageName());
                View f = ((View) v.findViewById(id));

                if (f instanceof Button) {
                    Button boton = (Button) v.findViewById(id);
                    datosEnviar[p - contadorTexto] = Integer.parseInt(boton.getTag().toString());
                    finalInt = p - contadorTexto;
                    Log.d("zing", "zing");
                } else {
                    EditText texto = (EditText) v.findViewById(id);
                    cadenaEnviar[contadorTexto] = texto.getText().toString().replace(" ", "%20");
                    contadorTexto++;
                    finalString = contadorTexto;
                    Log.d("CLick", "click");
                }

            }

            if (datosEnviar.length == 0) {
                datosEnviar[0] = origen;
            } else {
                datosEnviar[finalInt + 1] = origen;
            }

            if (observaciones_cadena.equals(""))
                observaciones_cadena = "%20";
            cadenaEnviar[finalString] = observaciones_cadena;

            Log.d("Largo datos", "- " + datosEnviar.length);
            Log.d("Largo valores", "- " + cadenaEnviar.length);


            InsertarEnBD guardar = new InsertarEnBD();
            guardar.contexto(getActivity());

            if (getActivity() instanceof formularioracindividual) {
                guardar.insertarEnBD(json, datosEnviar, cadenaEnviar, formulario, true);
            } else {
                guardar.insertarEnBD(json, datosEnviar, cadenaEnviar, formulario, false);
            }
        } else {
            Log.d("Esta esta", "soola");
            int[] datosEnviar = new int[2];
            String[] cadenaEnviar = new String[1];

            datosEnviar[0] = rtaMaestra;
            datosEnviar[1] = origen;
            cadenaEnviar[0] = "sds";

            InsertarEnBD guardar = new InsertarEnBD();
            guardar.contexto(getActivity());
            if (getActivity() instanceof formularioracindividual) {
                guardar.insertarEnBD(json, datosEnviar, cadenaEnviar, formulario, true);
            } else {
                guardar.insertarEnBD(json, datosEnviar, cadenaEnviar, formulario, false);
            }
        }
        */


    }

    public Button crearRespuestaMaestra(int tipo, final Context contexto) throws JSONException {

        final int tipoRta = tipo;

        String[] campos = new String[5];
        campos[0] = "Si";
        campos[1] = "Si";
        campos[2] = "M";
        campos[3] = "m";
        campos[4] = "N/A";

        numeroMaestras++;

        int idConcatenar = tipo + 100;

        final Button boton = new Button(contexto);
        boton.setId(idConcatenar);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(45, 45);
        params.setMargins(10, 10, 10, 10);
        boton.setLayoutParams(params);
        boton.setTag(20);
        boton.setText(campos[tipo]);
        boton.setBackground(getResources().getDrawable(R.drawable.estilosbotonformularioprincipal));
        boton.setTextSize(TypedValue.COMPLEX_UNIT_PX, 16);

        if (jsonDatos.getInt(0) == tipo) {
            boton.setBackgroundResource(R.drawable.estilosbotonformularioprincipalseleccionado);
        }

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rtaMaestra = tipoRta;
                repintar(contexto);
                //guardar(contexto);

                switch (rtaMaestra) {
                    case 1:
                        boton.setBackgroundResource(R.drawable.btnmnsi);
                        break;

                    case 2:
                        boton.setBackgroundResource(R.drawable.btnrojo);
                        break;

                    case 3:
                        boton.setBackgroundResource(R.drawable.btnamarillo);
                        break;

                    case 4:
                        boton.setBackgroundResource(R.drawable.btngris);
                        break;
                }


            }
        });

        return boton;

    }

    public LinearLayout crearRayaVerde(Context contexto) {
        LinearLayout rayaVerde = new LinearLayout(contexto);
        rayaVerde.setBackgroundColor(Color.parseColor("#61B246"));
        rayaVerde.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams LLHParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
        LLHParams.setMargins(15, 10, 15, 10);
        rayaVerde.setLayoutParams(LLHParams);
        return rayaVerde;
    }

    public void repintar(Context contexto) {

        String idCadena = String.valueOf("101");
        int id = getResources().getIdentifier(idCadena, "id", contexto.getPackageName());
        Button boton1 = (Button) v.findViewById(id);
        boton1.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);

        String idCadena2 = String.valueOf("102");
        int id2 = getResources().getIdentifier(idCadena2, "id", contexto.getPackageName());
        Button boton2 = (Button) v.findViewById(id2);
        boton2.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);

        String idCadena3 = String.valueOf("103");
        int id3 = getResources().getIdentifier(idCadena3, "id", contexto.getPackageName());
        Button boton3 = (Button) v.findViewById(id3);
        boton3.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);

        String idCadena4 = String.valueOf("104");
        int id4 = getResources().getIdentifier(idCadena4, "id", contexto.getPackageName());
        Button boton4 = (Button) v.findViewById(id4);
        boton4.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);

    }

    public void enviar(String nombre, int id_formulario) {


        json = nombre;
        formulario = id_formulario;


        Log.d("DMCP", jsonDatos.toString());

    }

    /*
    public void enviar(String nombre, int id_formulario, Boolean grupal) {
        critico = false;
        if (nombre.equals("RG2.3") || nombre.equals("RG3.1") || nombre.equals("RG3.2") || nombre.equals("RG3.5") || nombre.equals("RG3.9")) {
            critico = true;
        }

        json = nombre;
        formulario = id_formulario;

        String[] parts = nombre.split("\\.");
        parts[0] = parts[0].replace("R", "").toLowerCase();


        String query = "select * from " + parts[0] + "p" + parts[1] + " where ID_FORMULARIO = " + id_formulario;
        Log.d("Query", query);
        final Cursor cu = DaoAPP.daoSession.getDatabase().rawQuery(query, null);
        if (cu.moveToFirst()) {
            do {
                final int iterar = cu.getColumnCount();
                for (int j = 1; j < iterar; j++) {
                    jsonDatos.put(cu.getString(j));
                }
            } while (cu.moveToNext());
        }
        Log.d("DMCP", jsonDatos.toString());
    }
    */

    public void reportar(String rta) {

    }

    private void hideKeyboard() {
        // Check if no view has focus:
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

}