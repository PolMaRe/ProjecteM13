package com.example.projectem13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Temas extends AppCompatActivity {

    Button bSortirT,bTema,bEndavant,bEndarrere;
    ImageView imgTemas;
    String[] temas={"els animals", "els esports", "el menjar"};
    Integer numeroTema=0, maxTemes=temas.length-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
        bSortirT=findViewById(R.id.bSortirT);
        bTema=findViewById(R.id.bTema);
        bEndavant=findViewById(R.id.bEndavant);
        bEndarrere=findViewById(R.id.bEndarrere);
        imgTemas=findViewById(R.id.imgTemas);

        imgTemas.setImageResource(R.drawable.lagranja);

        bSortirT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Temas.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bTema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Temas.this,Seleccio.class);
                intent.putExtra("numero",numeroTema);
                startActivity(intent);
            }
        });

        bEndavant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroTema < maxTemes) {
                    numeroTema++;
                } else {
                    numeroTema=0;
                }
                canviarTema();
            }
        });

        bEndarrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroTema == 0) {
                    numeroTema=maxTemes;
                } else {
                    numeroTema--;
                }
                canviarTema();
            }
        });


    }

    public void canviarTema(){
        bTema.setText(temas[numeroTema]);
        switch (numeroTema){
            case 0:
                imgTemas.setImageResource(R.drawable.lagranja);
                break;
            case 1:
                imgTemas.setImageResource(R.drawable.elsesports);
                break;
            case 2:
                imgTemas.setImageResource(R.drawable.elmenjar);
                break;
            default:
                break;
        }

    }

}
