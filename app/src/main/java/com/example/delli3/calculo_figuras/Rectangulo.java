package com.example.delli3.calculo_figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {

    private EditText txtLado1,txtLado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        txtLado1=findViewById(R.id.txtLargo);
        txtLado2=findViewById(R.id.txtancho);
    }
    public void calcular(View v){
        Double ladoUno=Double.parseDouble(txtLado1.getText().toString());
        Double ladoDos=Double.parseDouble(txtLado2.getText().toString());
        Double resultado=Calculos.areaRectangulo(ladoUno,ladoDos);
        if(txtLado1.getText().equals("")){
            txtLado1.setError(getResources().getString(R.string.errorvacio));
        }else{
            if(txtLado2.getText().equals("")){
                txtLado2.setError(getResources().getString(R.string.errorvacio));
            }else{
                if(Double.parseDouble(txtLado1.getText().toString())<0){
                    txtLado1.setError(getResources().getString(R.string.errornegativo));
                }else{
                    if(Double.parseDouble(txtLado2.getText().toString())<0){
                        txtLado1.setError(getResources().getString(R.string.errornegativo));
                    }else{
                        Operaciones O = new Operaciones(getResources().getString(R.string.area_rectangulo),getResources().getString(R.string.largo)+": "+ladoUno+"\n"+
                                getResources().getString(R.string.ancho)+": "+ladoDos,resultado);
                        O.guardar();
                        Toast.makeText(getApplicationContext(),getResources().getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }


    }
    public void borrar(View v){
        txtLado1.setText("");
        txtLado2.setText("");
    }
}
