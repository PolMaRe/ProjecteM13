package com.example.projectem13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Configuracio extends AppCompatActivity {

    Button bSortirC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracio);
        bSortirC=findViewById(R.id.bSortirC);

        bSortirC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Configuracio.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
