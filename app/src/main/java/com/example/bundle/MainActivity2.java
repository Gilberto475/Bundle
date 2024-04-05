package com.example.bundle;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            ResultadosOperaciones resultados = (ResultadosOperaciones) bundle.getSerializable("resultados");
            if (resultados != null) {
                double resultado = resultados.getResultado();
                // Usa el resultado como desees, por ejemplo, puedes establecerlo en un TextView
                TextView textViewResultado = findViewById(R.id.textViewResultado);
                textViewResultado.setText(String.valueOf(resultado));
            }
        }
    }
}
