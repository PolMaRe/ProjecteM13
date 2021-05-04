package com.example.projectem13;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Celebracio extends AppCompatActivity {

    VideoView videoView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebracio);

        videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.clapping));
        videoView.start();
        intent = new Intent (this,Temas.class);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {startActivity(intent);}
        });
    }

}
