package incorporation.app.primera.mi.resistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import static incorporation.app.primera.mi.resistencias.R.array.bandas;

public class MainActivity extends AppCompatActivity {

    private Spinner banda_uno, banda_dos, banda_tres, banda_cuatro;
    private String banda1, banda2, banda3, banda4, tres_primeros, dos_primeros, tolerancia;
    private int posicion_uno, posicion_dos, posicion_tres, posicion_cuatro;
    private Button calculo;
    private TextView respuesta;
    private TextView mostrar_primera_linea, mostrar_segunda_linea, mostrar_tercera_linea, mostrar_cuarta_linea;     //a ver si organizamos los colores en los textview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banda_uno = (Spinner) findViewById(R.id.primera_linea);
        banda_dos = (Spinner) findViewById(R.id.segunda_linea);
        banda_tres = (Spinner) findViewById(R.id.tercera_linea);
        banda_cuatro = (Spinner) findViewById(R.id.cuarta_linea);
        calculo = (Button) findViewById(R.id.calcular);
        respuesta = (TextView) findViewById(R.id.respuesta);
        mostrar_primera_linea = (TextView) findViewById(R.id.mostrar_primera_linea);
        mostrar_segunda_linea = (TextView) findViewById(R.id.mostar_segunda_linea);
        mostrar_tercera_linea = (TextView) findViewById(R.id.mostrar_tercera_linea);
        mostrar_cuarta_linea = (TextView) findViewById(R.id.mostrar_cuarta_linea);

        //-------------------configurando el spinner--------------------------------------------------------
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, bandas, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_tol = ArrayAdapter.createFromResource(this, R.array.tolerancia, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_tol.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        banda_uno.setAdapter(adapter);
        banda_dos.setAdapter(adapter);
        banda_tres.setAdapter(adapter);
        banda_cuatro.setAdapter(adapter_tol);
        //--------------------------------------------------------------------------------------------------
        banda_uno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                banda1 = parent.getItemAtPosition(position).toString();
                posicion_uno = position;
                //pintar el background de los Textview del color seleccionado
                if (posicion_uno == 0) {
                    mostrar_primera_linea.setBackgroundColor(Color.BLACK);
                } else if (posicion_uno == 1) {
                    mostrar_primera_linea.setBackgroundColor(Color.argb(255, 139, 69, 19));
                } else if (posicion_uno == 2) {
                    mostrar_primera_linea.setBackgroundColor(Color.RED);
                } else if (posicion_uno == 3) {
                    mostrar_primera_linea.setBackgroundColor(Color.argb(255, 255, 165, 0));
                } else if (posicion_uno == 4) {
                    mostrar_primera_linea.setBackgroundColor(Color.YELLOW);
                } else if (posicion_uno == 5) {
                    mostrar_primera_linea.setBackgroundColor(Color.argb(255, 0, 255, 0));
                } else if (posicion_uno == 6) {
                    mostrar_primera_linea.setBackgroundColor(Color.BLUE);
                } else if (posicion_uno == 7) {
                    mostrar_primera_linea.setBackgroundColor(Color.argb(255, 148, 0, 211));
                } else if (posicion_uno == 8) {
                    mostrar_primera_linea.setBackgroundColor(Color.GRAY);
                } else if (posicion_uno == 9) {
                    mostrar_primera_linea.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--------------------------------------------------------------------------------------------------
        banda_dos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position,
                                       long id) {
                banda2 = parent.getItemAtPosition(position).toString();
                posicion_dos = position;
                //pintar el background de los Textview del color seleccionado
                if (posicion_dos == 0) {
                    mostrar_segunda_linea.setBackgroundColor(Color.BLACK);
                } else if (posicion_dos == 1) {
                    mostrar_segunda_linea.setBackgroundColor(Color.argb(255, 139, 69, 19));
                } else if (posicion_dos == 2) {
                    mostrar_segunda_linea.setBackgroundColor(Color.RED);
                } else if (posicion_dos == 3) {
                    mostrar_segunda_linea.setBackgroundColor(Color.argb(255, 255, 165, 0));
                } else if (posicion_dos == 4) {
                    mostrar_segunda_linea.setBackgroundColor(Color.YELLOW);
                } else if (posicion_dos == 5) {
                    mostrar_segunda_linea.setBackgroundColor(Color.argb(255, 0, 255, 0));
                } else if (posicion_dos == 6) {
                    mostrar_segunda_linea.setBackgroundColor(Color.BLUE);
                } else if (posicion_dos == 7) {
                    mostrar_segunda_linea.setBackgroundColor(Color.argb(255, 148, 0, 211));
                } else if (posicion_dos == 8) {
                    mostrar_segunda_linea.setBackgroundColor(Color.GRAY);
                } else if (posicion_dos == 9) {
                    mostrar_segunda_linea.setBackgroundColor(Color.WHITE);
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--------------------------------------------------------------------------------------------------
        banda_tres.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position,
                                       long id) {
                banda3 = parent.getItemAtPosition(position).toString();
                posicion_tres = position;
                //pintar el background de los Textview del color seleccionado
                if (posicion_tres == 0) {
                    mostrar_tercera_linea.setBackgroundColor(Color.BLACK);
                } else if (posicion_tres == 1) {
                    mostrar_tercera_linea.setBackgroundColor(Color.argb(255, 139, 69, 19));
                } else if (posicion_tres == 2) {
                    mostrar_tercera_linea.setBackgroundColor(Color.RED);
                } else if (posicion_tres == 3) {
                    mostrar_tercera_linea.setBackgroundColor(Color.argb(255, 255, 165, 0));
                } else if (posicion_tres == 4) {
                    mostrar_tercera_linea.setBackgroundColor(Color.YELLOW);
                } else if (posicion_tres == 5) {
                    mostrar_tercera_linea.setBackgroundColor(Color.argb(255, 0, 255, 0));
                } else if (posicion_tres == 6) {
                    mostrar_tercera_linea.setBackgroundColor(Color.BLUE);
                } else if (posicion_tres == 7) {
                    mostrar_tercera_linea.setBackgroundColor(Color.argb(255, 148, 0, 211));
                } else if (posicion_tres == 8) {
                    mostrar_tercera_linea.setBackgroundColor(Color.GRAY);
                } else if (posicion_tres == 9) {
                    mostrar_tercera_linea.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--------------------------------------------------------------------------------------------------
        banda_cuatro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position,
                                       long id) {
                banda4 = parent.getItemAtPosition(position).toString();
                posicion_cuatro = position;
                //pintar el background de los Textview del color seleccionado
                if (posicion_cuatro == 0) {
                    mostrar_cuarta_linea.setBackgroundColor(Color.argb(255, 139, 69, 19));
                } else if (posicion_cuatro == 1) {
                    mostrar_cuarta_linea.setBackgroundColor(Color.RED);
                } else if (posicion_cuatro == 2) {
                    mostrar_cuarta_linea.setBackgroundColor(Color.argb(255, 234, 190, 63));
                } else if (posicion_cuatro == 3) {
                    mostrar_cuarta_linea.setBackgroundColor(Color.argb(255, 185, 184, 181));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--------------------------------------------------------------------------------------------------
        calculo.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                /*-----------------------------------de entero a string
                int numero = 1234;
                String cadena = "";
                cadena = String.valueOf(numero);
                cadena= Integer.toString(numero);*/

                /*-----------------------------------de string a entero
                String cadena = "1234";
                int numero = 0;
                numero = Integer.parseInt(cadena)*/

                respuesta.setInputType(InputType.TYPE_NULL);        //aqui casual desabilitando el teclado para que no copien marikadas

                dos_primeros = "" + posicion_uno + posicion_dos;
                if (posicion_tres == 0) {
                    tres_primeros = dos_primeros;
                } else if (posicion_tres == 1) {
                    tres_primeros = dos_primeros + "0";
                } else if (posicion_tres == 2) {
                    tres_primeros = posicion_uno + "." + posicion_dos + "K";
                } else if (posicion_tres == 3) {
                    tres_primeros = dos_primeros + "K";
                } else if (posicion_tres == 4) {
                    tres_primeros = dos_primeros + "0K";
                } else if (posicion_tres == 5) {
                    tres_primeros = posicion_uno + "." + posicion_dos + "M";
                } else if (posicion_tres == 6) {
                    tres_primeros = dos_primeros + "M";
                } else if (posicion_tres == 7) {
                    tres_primeros = dos_primeros + "0M";
                } else if (posicion_tres == 8) {
                    tres_primeros = posicion_uno + "." + posicion_dos;
                } else if (posicion_tres == 9) {
                    tres_primeros = "0." + dos_primeros;
                }

                if (posicion_cuatro == 0) {
                    tolerancia = "1";
                } else if (posicion_cuatro == 1) {
                    tolerancia = "2";
                } else if (posicion_cuatro == 2) {
                    tolerancia = "5";
                } else if (posicion_cuatro == 3) {
                    tolerancia = "10";
                }
                respuesta.setText("" + tres_primeros + " Ω." + "\nTolerancia de: ±" + tolerancia + "%");

            }//fin onClick
        }); //fin calculo.setOnClickListener


    }//fin onCreate

    public void limpiar(View view) {
        respuesta.setText("");

    }
} //fin clase
