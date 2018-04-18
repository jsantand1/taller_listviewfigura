package com.example.delli3.calculo_figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {

    private EditText txtRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtRadio=findViewById(R.id.txtradioE);
    }
    public void calcular(View v){
        Double radio=Double.parseDouble(txtRadio.getText().toString());
        Double resultado=Calculos.volumenEsfera(radio);
        if(txtRadio.getText().equals("")){
            txtRadio.setError(getResources().getString(R.string.errorvacio));
        }else{
            if (Double.parseDouble(txtRadio.getText().toString())<0){
                txtRadio.setError(getResources().getString(R.string.errornegativo));
            }else{
                Operaciones O = new Operaciones(getResources().getString(R.string.volumen_esfera),getResources().getString(R.string.radio)+": "+radio,resultado);
                O.guardar();
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void borrar(View v){
        txtRadio.setText("");
    }
}
