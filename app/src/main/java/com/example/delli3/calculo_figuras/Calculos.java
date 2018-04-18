package com.example.delli3.calculo_figuras;

import android.content.res.Resources;

public class Calculos {
    public static Double areacuadrado(double lado){
      return lado*lado;
    }

    public static double areaRectangulo(double lado1, double lado2){
      return lado1*lado2;
    }

    public static double areaTriangulo(double base, double altura){
     return base*altura/2;
    }

    public static double areaCirculo(double radio){
        return  ((radio*radio)*Math.PI)/2;
    }

    public  static double volumenEsfera(double radio){return (4/3)*Math.PI*Math.pow(radio,3);}

    public static double volmenCilindro(double radio, double altura){return Math.pow(radio,2)*Math.PI*altura;}

    public static double volumenCono(double radio,double altura){ return (Math.PI*Math.pow(radio,2)*altura)/3;}

    public static double volumenCubo(double arista){ return arista*arista*arista;}

}
