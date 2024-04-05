// ResultadoDivisionActivity.java
package com.example.bundle;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoDivisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_division);

        // Obtener el resultado de la división de los extras del intent
        double resultado = getIntent().getDoubleExtra("resultado", 0.0);

        // Mostrar el resultado en un TextView
        TextView textViewResultado = findViewById(R.id.textViewResultadoDivision);
        if (!Double.isNaN(resultado)) {
            textViewResultado.setText("Resultado de la división: " + resultado);
        } else {
            textViewResultado.setText("No se puede dividir por cero");
        }
    }
}
