package naturacert.baumsoft.dev.naturacert;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment {
    int sistemaEstado = 0;
    int politicasEstado = 0;
    int programasEstado = 0;
    int procedimientosEstado = 0;
    int socialesEstado = 0;
    int laboralesEstado = 0;
    int ambientalesEstado = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1, container, false);

        final Button sistema = (Button) v.findViewById(R.id.sistema);
        sistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(sistemaEstado){
                    case 0:
                        sistema.setText(R.string.No);
                        sistemaEstado = 1;
                        break;
                    case 1:
                        sistema.setText(R.string.NA);
                        sistemaEstado = 2;
                        break;
                    case 2:
                        sistema.setText(R.string.Si);
                        sistemaEstado = 0;
                        break;
                }

            }
        });

        final Button btnMainSI = (Button) v.findViewById(R.id.btnMainSI);
        final Button btnMainM = (Button) v.findViewById(R.id.btnMainM);
        final Button btnMainm = (Button) v.findViewById(R.id.btnMainm);
        final Button btnMainNA = (Button) v.findViewById(R.id.btnMainNA);

        final Button politicas = (Button) v.findViewById(R.id.politicas);
        final Button programas = (Button) v.findViewById(R.id.programas);
        final Button procedimientos = (Button) v.findViewById(R.id.procedimientos);

        final Button sociales = (Button) v.findViewById(R.id.sociales);
        final Button laborales = (Button) v.findViewById(R.id.laborales);
        final Button ambientales = (Button) v.findViewById(R.id.ambientales);

        final Button btnMainD = (Button) v.findViewById(R.id.btnMainD);
        final Button btnMainE = (Button) v.findViewById(R.id.btnMainE);
        final Button btnMainO = (Button) v.findViewById(R.id.btnMainO);

        ImageButton observaciones = (ImageButton) v.findViewById(R.id.observaciones);

        btnMainSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerPrincipal(btnMainSI, btnMainM, btnMainm, btnMainNA);
            }
        });

        btnMainM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerPrincipal(btnMainM, btnMainSI, btnMainm, btnMainNA);
            }
        });

        btnMainm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerPrincipal(btnMainm, btnMainM, btnMainSI, btnMainNA);
            }
        });

        btnMainNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerPrincipal(btnMainNA, btnMainM, btnMainm, btnMainSI);
            }
        });

        politicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(politicasEstado){
                    case 0:
                        politicas.setBackgroundResource(R.drawable.estiloscumple);
                        politicasEstado = 1;
                        break;
                    case 1:
                        politicas.setBackgroundResource(R.drawable.estilosnocumple);
                        politicasEstado = 2;
                        break;
                    case 2:
                        politicas.setBackgroundResource(R.drawable.estilosnoaplica);
                        politicasEstado = 0;
                        break;
                }
            }
        });

        programas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(programasEstado){
                    case 0:
                        programas.setBackgroundResource(R.drawable.estiloscumple);
                        programasEstado = 1;
                        break;
                    case 1:
                        programas.setBackgroundResource(R.drawable.estilosnocumple);
                        programasEstado = 2;
                        break;
                    case 2:
                        programas.setBackgroundResource(R.drawable.estilosnoaplica);
                        programasEstado = 0;
                        break;
                }
            }
        });

        procedimientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(procedimientosEstado){
                    case 0:
                        procedimientos.setBackgroundResource(R.drawable.estiloscumple);
                        procedimientosEstado = 1;
                        break;
                    case 1:
                        procedimientos.setBackgroundResource(R.drawable.estilosnocumple);
                        procedimientosEstado = 2;
                        break;
                    case 2:
                        procedimientos.setBackgroundResource(R.drawable.estilosnoaplica);
                        procedimientosEstado = 0;
                        break;
                }
            }
        });

        sociales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(socialesEstado){
                    case 0:
                        sociales.setBackgroundResource(R.drawable.estiloscumple);
                        socialesEstado = 1;
                        break;
                    case 1:
                        sociales.setBackgroundResource(R.drawable.estilosnocumple);
                        socialesEstado = 2;
                        break;
                    case 2:
                        sociales.setBackgroundResource(R.drawable.estilosnoaplica);
                        socialesEstado = 0;
                        break;
                }
            }
        });

        laborales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (laboralesEstado) {
                    case 0:
                        laborales.setBackgroundResource(R.drawable.estiloscumple);
                        laboralesEstado = 1;
                        break;
                    case 1:
                        laborales.setBackgroundResource(R.drawable.estilosnocumple);
                        laboralesEstado = 2;
                        break;
                    case 2:
                        laborales.setBackgroundResource(R.drawable.estilosnoaplica);
                        laboralesEstado = 0;
                        break;
                }
            }
        });

        ambientales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ambientalesEstado){
                    case 0:
                        ambientales.setBackgroundResource(R.drawable.estiloscumple);
                        ambientalesEstado = 1;
                        break;
                    case 1:
                        ambientales.setBackgroundResource(R.drawable.estilosnocumple);
                        ambientalesEstado = 2;
                        break;
                    case 2:
                        ambientales.setBackgroundResource(R.drawable.estilosnoaplica);
                        ambientalesEstado = 0;
                        break;
                }
            }
        });

        btnMainD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerOrigen(btnMainD, btnMainE, btnMainO);
            }
        });

        btnMainE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerOrigen(btnMainE, btnMainD, btnMainO);
            }
        });

        btnMainO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escogerOrigen(btnMainO, btnMainE, btnMainD);
            }
        });

        observaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getActivity().getLayoutInflater();
                final View dialoglayout = inflater.inflate(R.layout.layout_observaciones, null);
                final AlertDialog constructor = new AlertDialog.Builder(getActivity()).create();
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

            }
        });


        return v;
    }

    private void escogerPrincipal(Button botonEscogido, Button boton1, Button boton2, Button boton3){
        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);
        boton1.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);
        boton2.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);
        boton3.setBackgroundResource(R.drawable.estilosbotonformularioprincipal);
        boton1.setTextColor(getResources().getColor(R.color.negro));
        boton2.setTextColor(getResources().getColor(R.color.negro));
        boton3.setTextColor(getResources().getColor(R.color.negro));

        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioprincipalseleccionado);
        botonEscogido.setTextColor(getResources().getColor(R.color.blanco));
    }

    private void escogerOrigen(Button botonEscogido, Button boton1, Button boton2){
        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioorigen);
        boton1.setBackgroundResource(R.drawable.estilosbotonformularioorigen);
        boton2.setBackgroundResource(R.drawable.estilosbotonformularioorigen);

        botonEscogido.setBackgroundResource(R.drawable.estilosbotonformularioorigenseleccionado);
    }

}