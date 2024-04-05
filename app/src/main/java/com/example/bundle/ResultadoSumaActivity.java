
package com.example.bundle;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoSumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_suma);

        // Obtener el resultado de la suma de los extras del intent
        double resultado = getIntent().getDoubleExtra("resultado", 0.0);

        // Mostrar el resultado en un TextView
        TextView textViewResultado = findViewById(R.id.textViewResultadoSum);
        textViewResultado.setText("Resultado de la suma: " + resultado);
    }
}
