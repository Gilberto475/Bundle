package com.example.bundle;

import java.io.Serializable;

public class ResultadosOperaciones implements Serializable {
    private double resultado;

    public ResultadosOperaciones(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
