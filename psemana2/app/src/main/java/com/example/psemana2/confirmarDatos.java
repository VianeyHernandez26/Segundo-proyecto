package com.example.psemana2;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.os.Bundle;


public class confirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();
        Toast toast = Toast.makeText(getApplicationContext(), "dd", 1);

        if(parametros == null)

        toast.show();


        TextView a = findViewById(R.id.nombre);

        a.setText(parametros.getString("Nombre"));

        a = findViewById(R.id.telefono);
        a.setText(parametros.getString("Telefono"));

        a = findViewById(R.id.email);
        a.setText(parametros.getString("Email"));

         a = findViewById(R.id.fecha);
        a.setText(parametros.getString("Fecha"));





    }
}
