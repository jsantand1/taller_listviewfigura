package com.example.delli3.calculo_figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
  private EditText txtLado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtLado=findViewById(R.id.txtLado);
    }
    public void calcular(View v){
        Double lado=Double.parseDouble(txtLado.getText().toString());
        Double resultado=Calculos.areacuadrado(lado);
        if(txtLado.getText().toString().isEmpty()){
           txtLado.setError(getResources().getString(R.string.errorvacio));
        }else{
            if (Double.parseDouble(txtLado.getText().toString())<0){
                txtLado.setError(getResources().getString(R.string.errornegativo));
            }else{
          Operaciones O = new Operaciones(getResources().getString(R.string.area_cuadrado),getResources().getString(R.string.lado)+": "+lado,resultado);
          O.guardar();
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void borrar(View v){
        txtLado.setText("");
    }
}
