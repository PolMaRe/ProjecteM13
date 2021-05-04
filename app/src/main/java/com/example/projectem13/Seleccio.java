package com.example.projectem13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Seleccio extends AppCompatActivity {

    Button bParelles,bRelacionar,bSortirS;
    Integer numeroTema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccio);

        Intent intent = getIntent();
        numeroTema = intent.getIntExtra("numero",0);


        bParelles = findViewById(R.id.bParelles);
        bRelacionar = findViewById(R.id.bRelacionar);
        bSortirS = findViewById(R.id.bSortirS);

        bSortirS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Seleccio.this,Temas.class);
                startActivity(intent);
            }
        });

        bRelacionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Seleccio.this,Relacionar.class);
                intent.putExtra("numero",numeroTema);
                startActivity(intent);
            }
        });

        bParelles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Seleccio.this,Parelles.class);
                intent.putExtra("numero",numeroTema);
                startActivity(intent);
            }
        });

    }
}
