package com.example.pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnpantalla;
    EditText edit1;
    EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btnpantalla= findViewById(R.id.btnpantalla);

        btnpantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpantalla = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(btnpantalla);
                String usuario = edit1.getText().toString().trim();
                String contraseña = edit2.getText().toString().trim();

                if (usuario.isEmpty() || contraseña.isEmpty()) {
                    mostrarMensaje("Por favor llenar los campos");
                } else if (usuario.equals("uac123") && contraseña.equals("12345678")) {

                    mostrarMensaje("Iniciando sesión...");
                } else {
                    mostrarMensaje("Usuario o contraseña incorrectos");
                }
            }
        });
    }

    private void mostrarMensaje(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }

    }
