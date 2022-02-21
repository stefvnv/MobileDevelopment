package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        //Sounds
        ImageButton imgHello = findViewById(R.id.imgHello);

        imgHello.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(GreetingsActivity.this, R.raw.hola);
            mp.start();
        });


        ImageButton imgHowAreYou = findViewById(R.id.imgHowAreYou);

        imgHowAreYou.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(GreetingsActivity.this, R.raw.howareyou);
            mp.start();
        });



    }
}