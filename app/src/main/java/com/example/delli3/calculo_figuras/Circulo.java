package com.example.delli3.calculo_figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Circulo extends AppCompatActivity {

    private EditText txtRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        txtRadio=findViewById(R.id.txtradio);
    }
    public void calcular(View v){
        Double radio=Double.parseDouble(txtRadio.getText().toString());
        Double resultado=Calculos.areaCirculo(radio);
        if(txtRadio.getText().equals("")){
            txtRadio.setError(getResources().getString(R.string.errorvacio));
        }else{
            if (Double.parseDouble(txtRadio.getText().toString())<0){
                txtRadio.setError(getResources().getString(R.string.errornegativo));
            }else{
                Operaciones O = new Operaciones(getResources().getString(R.string.area_circulo),getResources().getString(R.string.radio)+": "+radio,resultado);
                O.guardar();
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void borrar(View v){
        txtRadio.setText("");
    }
}
