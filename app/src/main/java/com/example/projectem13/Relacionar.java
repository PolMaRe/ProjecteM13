package com.example.projectem13;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Relacionar extends AppCompatActivity {

    Button bSortirR,bOpcio1,bOpcio2,bOpcio3,bAltaveu;
    ImageView imgImatge;
    Integer numeroTema, indexParaula=0;
    List<String> paraules,quantitatBotons;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relacionar);

        Intent intent = getIntent();
        numeroTema = intent.getIntExtra("numero",0);

        bSortirR = findViewById(R.id.bSortirR);
        bOpcio1 = findViewById(R.id.bOpcio1);
        bOpcio2 = findViewById(R.id.bOpcio2);
        bOpcio3 = findViewById(R.id.bOpcio3);
        bAltaveu = findViewById(R.id.bAltaveu);
        imgImatge = findViewById(R.id.imgImatge);
        textView = findViewById(R.id.textView);

        quantitatBotons = new ArrayList<String>();

        quantitatBotons.add("1");
        quantitatBotons.add("2");
        quantitatBotons.add("3");

        paraules = new ArrayList<String>();

        canviarTema();
        triarParaules();

        posarImatge();

        bSortirR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Relacionar.this,Temas.class);
                startActivity(intent);
            }
        });

        bOpcio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bOpcio1.getText().equals(textView.getText())) {
                    triarParaules();
                }
            }
        });

        bOpcio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bOpcio2.getText().equals(textView.getText())) {
                    triarParaules();
                }
            }
        });

        bOpcio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bOpcio3.getText().equals(textView.getText())) {
                    triarParaules();
                }
            }
        });

        bAltaveu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproduirAudio();
            }
        });
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
            textView.setText(paraules.get(indexParaula));
            posarParaules();
            posarImatge();
            indexParaula++;
        }
    }

    public void posarParaules(){
        Collections.shuffle(quantitatBotons);

        for (int i=0;i <= 2;i++){
            switch (quantitatBotons.get(i)){
                case "1":
                    if (i==0){
                        bOpcio1.setText(paraules.get(indexParaula));
                    } else {
                        bOpcio1.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "2":
                    if (i==0){
                        bOpcio2.setText(paraules.get(indexParaula));
                    } else {
                        bOpcio2.setText(paraulaAleatoria(indexParaula));
                    }
                    break;
                case "3":
                    if (i==0){
                        bOpcio3.setText(paraules.get(indexParaula));
                    } else {
                        bOpcio3.setText(paraulaAleatoria(indexParaula));
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

    public void posarImatge(){
        String resource = resourceName();
        imgImatge.setImageResource(getResources().getIdentifier(resource, "drawable", getPackageName()));
    }

    public void reproduirAudio(){
        String resource = resourceName();
        MediaPlayer mp = MediaPlayer.create(this, getResources().getIdentifier(resource, "raw", getPackageName()));
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mediaPlayer){
                mp.release();
            }
        });
        mp.start();
    }

    public String resourceName(){
        String refinarParaula = textView.getText().toString().replace("'","");
        refinarParaula = refinarParaula.replace("à","a");
        refinarParaula = refinarParaula.replace("ó","o");
        refinarParaula = refinarParaula.replace("ú","u");
        return refinarParaula.replace(" ","");
    }

}
