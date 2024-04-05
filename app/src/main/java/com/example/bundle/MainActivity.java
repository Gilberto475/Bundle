package com.example.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero1, editTextNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRestar = findViewById(R.id.botonRestar);
        Button botonMultiplicar = findViewById(R.id.botonMultiplicar);
        Button botonDividir = findViewById(R.id.botonDividir);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularSuma();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResta();
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMultiplicacion();
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularDivision();
            }
        });
    }

    private void calcularSuma() {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
        double resultado = numero1 + numero2;

        Intent intent = new Intent(MainActivity.this, ResultadoSumaActivity.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void calcularResta() {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
        double resultado = numero1 - numero2;

        Intent intent = new Intent(MainActivity.this, ResultadoRestaActivity.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void calcularMultiplicacion() {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
        double resultado = numero1 * numero2;

        Intent intent = new Intent(MainActivity.this, ResultadoMultiplicacionActivity.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void calcularDivision() {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
        double resultado;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            resultado = Double.NaN; // Not a Number
        }

        Intent intent = new Intent(MainActivity.this, ResultadoDivisionActivity.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }
}
