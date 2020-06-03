package com.example.psemana2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText ;
import android.view.View;
import android.content.Intent;



import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText   varNombre   = findViewById(R.id.nombre);
        final EditText   varTelefono   = findViewById(R.id.telefono);
        final EditText   varEmail  = findViewById(R.id.email);
        final EditText   varNacimiento  = findViewById(R.id.fecha);



        Button button =  findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent cosa = new Intent(MainActivity.this,confirmarDatos.class);



                cosa.putExtra("Nombre",varNombre.getText().toString());
                cosa.putExtra("Telefono",varTelefono.getText().toString());
                cosa.putExtra("Fecha",varNacimiento.getText().toString());
                cosa.putExtra("Email",varEmail.getText().toString());

                startActivity(cosa);
            }
        });}
    }


