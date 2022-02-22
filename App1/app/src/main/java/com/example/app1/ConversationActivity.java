package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConversationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        //Sounds
        ImageButton imgHello = findViewById(R.id.imgHello);
        imgHello.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.hola);
            mp.start();
        });

        ImageButton imgGoodMorning = findViewById(R.id.imgGoodMorning);
        imgGoodMorning.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.goodmorning);
            mp.start();
        });

        ImageButton imgGoodAfternoon = findViewById(R.id.imgGoodAfternoon);
        imgGoodAfternoon.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.goodafternoon);
            mp.start();
        });

        ImageButton imgGoodnight = findViewById(R.id.imgGoodNight);
        imgGoodnight.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.goodnight);
            mp.start();
        });

        ImageButton imgHowAreYou = findViewById(R.id.imgHowAreYou);
        imgHowAreYou.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.howareyou);
            mp.start();
        });

        ImageButton imgGood = findViewById(R.id.imgGood);
        imgGood.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.good);
            mp.start();
        });

        ImageButton imgWhatsYourName = findViewById(R.id.imgWhatsYourName);
        imgWhatsYourName.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.whatsyourname);
            mp.start();
        });

        ImageButton imgMyName = findViewById(R.id.imgMyName);
        imgMyName.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.mynameis);
            mp.start();
        });

        ImageButton imgPleased = findViewById(R.id.imgPleased);
        imgPleased.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.pleased);
            mp.start();
        });

        ImageButton imgHowOldAreYou = findViewById(R.id.imgHowOldAreYou);
        imgHowOldAreYou.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.howold);
            mp.start();
        });

        ImageButton imgIamYearsOld = findViewById(R.id.imgIamYearsOld);
        imgIamYearsOld.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.iamyearsold);
            mp.start();
        });

        ImageButton imgSeeYouLater = findViewById(R.id.imgSeeYouLater);
        imgSeeYouLater.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.seeyou);
            mp.start();
        });

        ImageButton imgGoodbye = findViewById(R.id.imgGoodbye);
        imgGoodbye.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.goodbye);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(ConversationActivity.this, GreetingsActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(ConversationActivity.this, ConversationActivity.class);
        startActivity(i);
    }
}