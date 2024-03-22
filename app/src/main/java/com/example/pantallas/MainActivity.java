package com.example.pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnpantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpantalla = (Button) findViewById(R.id.btnpantalla);
        btnpantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnpantalla = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(btnpantalla);
            }
        });
    }
}