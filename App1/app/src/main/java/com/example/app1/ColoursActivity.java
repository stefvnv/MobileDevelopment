package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        //Sounds
        ImageButton imgBlack = findViewById(R.id.imgBlack);
        imgBlack.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.black);
            mp.start();
        });

        ImageButton imgWhite = findViewById(R.id.imgWhite);
        imgWhite.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.white);
            mp.start();
        });

        ImageButton imgRed = findViewById(R.id.imgRed);
        imgRed.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.red);
            mp.start();
        });

        ImageButton imgGreen = findViewById(R.id.imgGreen);
        imgGreen.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.green);
            mp.start();
        });

        ImageButton imgBlue = findViewById(R.id.imgBlue);
        imgBlue.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.blue);
            mp.start();
        });

        ImageButton imgYellow = findViewById(R.id.imgYellow);
        imgYellow.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.yellow);
            mp.start();
        });

        ImageButton imgBrown = findViewById(R.id.imgBrown);
        imgBrown.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.brown);
            mp.start();
        });

        ImageButton imgOrange = findViewById(R.id.imgOrange);
        imgOrange.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.orange);
            mp.start();
        });

        ImageButton imgPurple = findViewById(R.id.imgPurple);
        imgPurple.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.purple);
            mp.start();
        });

        ImageButton imgPink = findViewById(R.id.imgPink);
        imgPink.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.pink);
            mp.start();
        });

        ImageButton imgGrey = findViewById(R.id.imgGrey);
        imgGrey.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.grey);
            mp.start();
        });

        ImageButton imgBeige = findViewById(R.id.imgBeige);
        imgBeige.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ColoursActivity.this, R.raw.beige);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(ColoursActivity.this, DetailsActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(ColoursActivity.this, TimeActivity.class);
        startActivity(i);
    }
}