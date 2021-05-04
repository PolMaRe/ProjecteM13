package com.example.projectem13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bComencar, bConfiguracio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bComencar=findViewById(R.id.bComencar);
        bConfiguracio=findViewById(R.id.bConfiguracio);

        bComencar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,Temas.class);
                startActivity(intent);
            }
        });

        bConfiguracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,Celebracio.class);
                startActivity(intent);
            }
        });
    }
}