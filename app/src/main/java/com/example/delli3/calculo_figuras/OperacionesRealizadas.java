package com.example.delli3.calculo_figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class OperacionesRealizadas extends AppCompatActivity {

    private TableLayout tabla1;
    private ArrayList<Operaciones> Operaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_realizadas);
        tabla1 = findViewById(R.id.tabla);
        Operaciones= Datos.obtener();
        for (int i  = 0; i < Operaciones.size(); i++) {
            TableRow fila = new TableRow(this    );
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+i);
            c2.setText(Operaciones.get(i).getOperacion());
            c3.setText(Operaciones.get(i).getDatos());
            c4.setText(Operaciones.get(i).getResultado().toString());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla1.addView(fila);

            }

    }
}
