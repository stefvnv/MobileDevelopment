package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DirectionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        //Sounds
        ImageButton imgWhereIs = findViewById(R.id.imgWhereIs);
        imgWhereIs.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.whereis);
            mp.start();
        });

        ImageButton imgGetThere = findViewById(R.id.imgGetThere);
        imgGetThere.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.getthere);
            mp.start();
        });

        ImageButton imgHowFar = findViewById(R.id.imgHowFar);
        imgHowFar.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.howfar);
            mp.start();
        });

        ImageButton imgTurnLeft = findViewById(R.id.imgTurnLeft);
        imgTurnLeft.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.turnleft);
            mp.start();
        });

        ImageButton imgTurnRight = findViewById(R.id.imgTurnRight);
        imgTurnRight.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.turnright);
            mp.start();
        });

        ImageButton imgCross = findViewById(R.id.imgCross);
        imgCross.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.cross);
            mp.start();
        });

        ImageButton imgFront = findViewById(R.id.imgFront);
        imgFront.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.front);
            mp.start();
        });

        ImageButton imgBehind = findViewById(R.id.imgBehind);
        imgBehind.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.behind);
            mp.start();
        });

        ImageButton imgCont = findViewById(R.id.imgCont);
        imgCont.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.cont);
            mp.start();
        });

        ImageButton imgHere = findViewById(R.id.imgHere);
        imgHere.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.here);
            mp.start();
        });

        ImageButton imgThere = findViewById(R.id.imgThere);
        imgThere.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DirectionsActivity.this, R.raw.there);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(DirectionsActivity.this, WeatherActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(DirectionsActivity.this, InformationActivity.class);
        startActivity(i);
    }
}