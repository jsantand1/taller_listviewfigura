package com.example.delli3.calculo_figuras;

public class Operaciones {
    private String operacion,datos;
    private Double resultado;

    public Operaciones(String operacion, String datos, Double resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public void guardar(){Datos.guardar(this);}
}
