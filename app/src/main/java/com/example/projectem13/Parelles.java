package com.example.projectem13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import androidx.appcompat.app.AppCompatActivity;

public class Parelles extends AppCompatActivity {

    Button bSortirP,bParaula1,bParaula2,bParaula3,bParaula4,bParaula5,bParaula6,bParaula7,bParaula8,bParaula9;
    TextView txtParaula;
    Integer numeroTema, indexParaula=0, encerts=0;
    List<String> paraules,quantitatBotons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parelles);

        Intent intent = getIntent();
        numeroTema = intent.getIntExtra("numero",0);

        bParaula1 = findViewById(R.id.bParaula1);
        bSortirP = findViewById(R.id.bSortirP);
        bParaula2 = findViewById(R.id.bParaula2);
        bParaula3 = findViewById(R.id.bParaula3);
        bParaula4 = findViewById(R.id.bParaula4);
        bParaula5 = findViewById(R.id.bParaula5);
        bParaula6 = findViewById(R.id.bParaula6);
        bParaula7 = findViewById(R.id.bParaula7);
        bParaula8 = findViewById(R.id.bParaula8);
        bParaula9 = findViewById(R.id.bParaula9);
        txtParaula = findViewById(R.id.txtParaula);

        quantitatBotons = new ArrayList<String>();

        quantitatBotons.add("1");
        quantitatBotons.add("2");
        quantitatBotons.add("3");
        quantitatBotons.add("4");
        quantitatBotons.add("5");
        quantitatBotons.add("6");
        quantitatBotons.add("7");
        quantitatBotons.add("8");
        quantitatBotons.add("9");

        paraules = new ArrayList<String>();

        canviarTema();
        triarParaules();

        bSortirP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Parelles.this,Temas.class);
                startActivity(intent);
            }
        });

        bParaula1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula1.getText().equals(txtParaula.getText())) {
                    bParaula1.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula2.getText().equals(txtParaula.getText())) {
                    bParaula2.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula3.getText().equals(txtParaula.getText())) {
                    bParaula3.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula4.getText().equals(txtParaula.getText())) {
                    bParaula4.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula5.getText().equals(txtParaula.getText())) {
                    bParaula5.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula6.getText().equals(txtParaula.getText())) {
                    bParaula6.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula7.getText().equals(txtParaula.getText())) {
                    bParaula7.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula8.getText().equals(txtParaula.getText())) {
                    bParaula8.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });

        bParaula9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bParaula9.getText().equals(txtParaula.getText())) {
                    bParaula9.setText("✔");
                    encerts++;
                    encertades();
                }
            }
        });


    }
    public void encertades(){
        if (encerts==3){
            encerts = 0;
            triarParaules();
        }
    }


    public void canviarTema(){
        switch (numeroTema){
            case 0:
                //animals
                paraules.add("el gos");
                paraules.add("el gat");
                paraules.add("la vaca");
                paraules.add("el porc");
                paraules.add("l'ovella");
                paraules.add("el conill");
                paraules.add("la rata");
                paraules.add("el peix");
                paraules.add("la formiga");
                paraules.add("la mosca");
                paraules.add("el mosquit");
                paraules.add("l'abella");
                paraules.add("l'ocell");
                paraules.add("el cavall");
                paraules.add("la papallona");
                Collections.shuffle(paraules);

                break;
            case 1:
                //esports
                paraules.add("la pilota");
                paraules.add("els escacs");
                paraules.add("la raqueta");
                paraules.add("el bàsquet");
                paraules.add("el fútbol");
                paraules.add("la natació");
                paraules.add("la piscina");
                paraules.add("la cistella");
                paraules.add("la porteria");
                Collections.shuffle(paraules);

                break;
            case 2:
                //menjar
                paraules.add("el pa");
                paraules.add("la xocolata");
                paraules.add("la sopa");
                paraules.add("el tomàquet");
                paraules.add("l'arrós");
                paraules.add("la llet");
                paraules.add("el pollastre");
                paraules.add("l'hamburguesa");
                paraules.add("els macarrons");
                paraules.add("la pizza");
                paraules.add("el gelat");
                paraules.add("el peix");
                paraules.add("les patates");
                Collections.shuffle(paraules);

                break;
            default:
                break;
        }

    }

    public void triarParaules(){
        if (indexParaula==paraules.size()){
            //Quan s'acaba un tema, s'obre aquesta activity
            Intent intent = new Intent (this,Celebracio.class);
            startActivity(intent);
        } else {
            txtParaula.setText(paraules.get(indexParaula));
            posarParaules();
            indexParaula++;
        }
    }

    public void posarParaules(){
        Collections.shuffle(quantitatBotons);

        for (int i=0;i <= 8;i++){
            switch (quantitatBotons.get(i)){
                case "1":
                    if (i<3){
                        bParaula1.setText(paraules.get(indexParaula));
                    } else {
                        bParaula1.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "2":
                    if (i<3){
                        bParaula2.setText(paraules.get(indexParaula));
                    } else {
                        bParaula2.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "3":
                    if (i<3){
                        bParaula3.setText(paraules.get(indexParaula));
                    } else {
                        bParaula3.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "4":
                    if (i<3){
                        bParaula4.setText(paraules.get(indexParaula));
                    } else {
                        bParaula4.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "5":
                    if (i<3){
                        bParaula5.setText(paraules.get(indexParaula));
                    } else {
                        bParaula5.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "6":
                    if (i<3){
                        bParaula6.setText(paraules.get(indexParaula));
                    } else {
                        bParaula6.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "7":
                    if (i<3){
                        bParaula7.setText(paraules.get(indexParaula));
                    } else {
                        bParaula7.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "8":
                    if (i<3){
                        bParaula8.setText(paraules.get(indexParaula));
                    } else {
                        bParaula8.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "9":
                    if (i<3){
                        bParaula9.setText(paraules.get(indexParaula));
                    } else {
                        bParaula9.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
            }
        }
    }

    public String paraulaAleatoria(int prohibit){
        boolean prohibida = true;
        int randomNum=0;
        while (prohibida){
            randomNum = ThreadLocalRandom.current().nextInt(0, paraules.size());
            if (randomNum==prohibit){
            }else{
                prohibida= false;
            }
        }
        return paraules.get(randomNum);
    }

}
