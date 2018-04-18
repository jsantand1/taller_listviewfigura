package com.example.delli3.calculo_figuras;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Operaciones> operacion= new ArrayList<>();
    public static void guardar (Operaciones p){
        operacion.add(p);
    }
    public static ArrayList<Operaciones> obtener (){
        return operacion;
    }
}
