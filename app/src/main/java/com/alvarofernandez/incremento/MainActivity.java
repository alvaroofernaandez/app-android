package com.alvarofernandez.incremento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView numero;
    TextView divisores1;
    TextView divisores2;
    TextView divisores3;
    TextView divisores4;
    TextView divisores5;
    Button btnRes;
    Button btnIncrement;
    TextView titulo;
    int contador;
    int contadorDiv1;
    int contadorDiv2;
    int contadorDiv3;
    int contadorDiv4;
    int contadorDiv5;

    boolean idiomaESP;
    boolean idiomaENG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        contadorDiv1 = 0;
        contadorDiv2 = 0;
        contadorDiv3 = 0;
        contadorDiv4 = 0;
        contadorDiv5 = 0;
        numero = (TextView) findViewById(R.id.tvContador);
        divisores1 = (TextView) findViewById(R.id.tvDivisor1);
        divisores2 = (TextView) findViewById(R.id.tvDivisor2);
        divisores3 = (TextView) findViewById(R.id.tvDivisor3);
        divisores4 = (TextView) findViewById(R.id.tvDivisor4);
        divisores5 = (TextView) findViewById(R.id.tvDivisor5);
        btnRes = (Button) findViewById(R.id.btnReset);
        btnIncrement = (Button) findViewById(R.id.btnIncrementar);
        titulo = (TextView) findViewById(R.id.tvTitulo);
        idiomaESP = true;
        idiomaENG = false;

    }

    public void funcionIncrementar(View view) {
        if (this.contador < 20) {
            try {
                btnIncrement.setText("Incrementar");
                contador++;
                contadorDiv1++;
                numero.setText("Actual: " + contador);
                divisores1.setText("Es divisor de 1: " + contadorDiv1);
                Log.i("miPrograma", "Incrementado.");
                Log.i("miPrograma", "Divisor de 1 encontrado.");
                funcionDivisores2();
                funcionDivisores3();
                funcionDivisores4();
                funcionDivisores5();
            } catch (Exception e) {
                Log.e("miPrograma", "Error al incrementar.");
            }
        } else {
            funcionFinalizar(view);
        }
    }

    public void funcionReset(View view) {
        contador = 0;
        contadorDiv1 = 0;
        contadorDiv2 = 0;
        contadorDiv3 = 0;
        contadorDiv4 = 0;
        contadorDiv5 = 0;

        numero.setText("Actual: " + contador);
        divisores1.setText("Es divisor de 1: " + contadorDiv1);
        divisores2.setText("Es divisor de 2: " + contadorDiv2);
        divisores3.setText("Es divisor de 3: " + contadorDiv3);
        divisores4.setText("Es divisor de 4: " + contadorDiv4);
        divisores5.setText("Es divisor de 5: " + contadorDiv5);
    }

    public void funcionDivisores2() {
        try {
            if (this.contador % 2 == 0) {
                contadorDiv2++;
                divisores2.setText("Es divisor de 2: " + contadorDiv2);
                Log.i("miPrograma", "Divisor de 2 encontrado.");
            }
        } catch (Exception e) {
        Log.e("miPrograma", "Error al encontrar divisor de 2.");
        }
    }

    public void funcionDivisores3() {
        try {
            if (this.contador % 3 == 0) {
                contadorDiv3++;
                divisores3.setText("Es divisor de 3: " + contadorDiv3);
                Log.i("miPrograma", "Divisor de 3 encontrado.");

            }
        } catch (Exception e) {
            Log.e("miPrograma", "Error al encontrar divisor de 3.");
        }
    }

    public void funcionDivisores4() {
        try {
            if (this.contador % 4 == 0) {
                contadorDiv4++;
                divisores4.setText("Es divisor de 4: " + contadorDiv4);
                Log.i("miPrograma", "Divisor de 4 encontrado.");

            }
        } catch (Exception e) {
            Log.e("miPrograma", "Error al encontrar divisor de 4.");
        }
    }

    public void funcionDivisores5() {
        try {
            if (this.contador % 5 == 0) {
                contadorDiv5++;
                divisores5.setText("Es divisor de 5: " + contadorDiv5);
                Log.i("miPrograma", "Divisor de 5 encontrado.");

            }
        } catch (Exception e) {
            Log.e("miPrograma", "Error al encontrar divisor de 2.");
        }
    }

    public void funcionCambiarIdiomaESP(View view) {
        this.idiomaESP = true;

        titulo.setText("Función Incrementar \uD83C\uDDEA\uD83C\uDDF8");
    }

    public void funcionCambiarIdiomaENG(View view) {

        this.idiomaENG = true;

        titulo.setText("Increase Function \uD83C\uDDEC\uD83C\uDDE7");
    }

    public void funcionDecrementar(View view) {

        if (contador <= 0) {
            Toast.makeText(this, "Ya no se puede decrementar más.", Toast.LENGTH_SHORT).show();
            Log.e("miPrograma", "Valor ya es 0, no puede ser decrementado.");
        } else {
            contador--;
            numero.setText("Actual: " + contador);
            Log.i("miPrograma", "Valor decrementado.");
        }

        if (contador % 1 == 0 && contadorDiv1 > 0) {
            contadorDiv1--;
            divisores1.setText("Es divisor de 1: " + contadorDiv1);
            Log.i("miPrograma", "Divisor de 1 decrementado.");
        }

        if (contador % 2 == 0 && contadorDiv2 > 0) {
            contadorDiv2--;
            divisores2.setText("Es divisor de 2: " + contadorDiv2);
            Log.i("miPrograma", "Divisor de 2 decrementado.");
        }

        if (contador % 3 == 0 && contadorDiv3 > 0) {
            contadorDiv3--;
            divisores3.setText("Es divisor de 3: " + contadorDiv3);
            Log.i("miPrograma", "Divisor de 3 decrementado.");
        }

        if (contador % 4 == 0 && contadorDiv4 > 0) {
            contadorDiv4--;
            divisores4.setText("Es divisor de 4: " + contadorDiv4);
            Log.i("miPrograma", "Divisor de 4 decrementado.");
        }

        if (contador % 5 == 0 && contadorDiv5 > 0) {
            contadorDiv5--;
            divisores5.setText("Es divisor de 5: " + contadorDiv5);
            Log.i("miPrograma", "Divisor de 5 decrementado.");
        }
    }


    public void funcionFinalizar(View view) {
        funcionReset(view);
        btnIncrement.setText("FINALIZADA.");
    }
}