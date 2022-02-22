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
        setContentView(R.layout.activity_conversation);

        //Sounds
        ImageButton imgYes = findViewById(R.id.imgYes);
        imgYes.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.yes);
            mp.start();
        });

        ImageButton imgNo = findViewById(R.id.imgNo);
        imgNo.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.no);
            mp.start();
        });

        ImageButton imgPlease = findViewById(R.id.imgPlease);
        imgPlease.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.please);
            mp.start();
        });

        ImageButton imgThanks = findViewById(R.id.imgThanks);
        imgThanks.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.thanks);
            mp.start();
        });

        ImageButton imgExcuseMe = findViewById(R.id.imgExcuseMe);
        imgExcuseMe.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.excuseme);
            mp.start();
        });

        ImageButton imgIdk = findViewById(R.id.imgIdk);
        imgIdk.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.idk);
            mp.start();
        });

        ImageButton imgYoureWelcome = findViewById(R.id.imgYoureWelcome);
        imgYoureWelcome.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.yourewelcome);
            mp.start();
        });

        ImageButton imgIunderstand = findViewById(R.id.imgIunderstand);
        imgIunderstand.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.iunderstand);
            mp.start();
        });

        ImageButton imgImsorry = findViewById(R.id.imgImsorry);
        imgImsorry.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.sorry);
            mp.start();
        });

        ImageButton imgIlikeIt = findViewById(R.id.imgIlikeIt);
        imgIlikeIt.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.ilikeit);
            mp.start();
        });

        ImageButton imgDontSpeakSpanish = findViewById(R.id.imgDontSpeakSpanish);
        imgDontSpeakSpanish.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.dontspeakspanish);
            mp.start();
        });

        ImageButton imgDoYouSpeakEnglish = findViewById(R.id.imgDoYouSpeakEnglish);
        imgDoYouSpeakEnglish.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.speakenglish);
            mp.start();
        });

        ImageButton imgHelp = findViewById(R.id.imgHelp);
        imgHelp.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(ConversationActivity.this, R.raw.help);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(ConversationActivity.this, GreetingsActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(ConversationActivity.this, DetailsActivity.class);
        startActivity(i);
    }
}