package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        //Sounds
        ImageButton imgClock = findViewById(R.id.imgClock);
        imgClock.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.clock);
            mp.start();
        });

        ImageButton imgHour = findViewById(R.id.imgHour);
        imgHour.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.hour);
            mp.start();
        });

        ImageButton imgMinute = findViewById(R.id.imgMinute);
        imgMinute.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.minute);
            mp.start();
        });

        ImageButton imgSecond = findViewById(R.id.imgSecond);
        imgSecond.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.second);
            mp.start();
        });

        ImageButton imgHalf = findViewById(R.id.imgHalf);
        imgHalf.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.half);
            mp.start();
        });

        ImageButton imgQuarter = findViewById(R.id.imgQuarter);
        imgQuarter.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.quarter);
            mp.start();
        });

        ImageButton imgMonday = findViewById(R.id.imgMonday);
        imgMonday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.monday);
            mp.start();
        });

        ImageButton imgTuesday = findViewById(R.id.imgTuesday);
        imgTuesday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.tuesday);
            mp.start();
        });

        ImageButton imgWednesday = findViewById(R.id.imgWednesday);
        imgWednesday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.wednesday);
            mp.start();
        });

        ImageButton imgThursday = findViewById(R.id.imgThursday);
        imgThursday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.thursday);
            mp.start();
        });

        ImageButton imgFriday = findViewById(R.id.imgFriday);
        imgFriday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.friday);
            mp.start();
        });

        ImageButton imgSaturday = findViewById(R.id.imgSaturday);
        imgSaturday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.saturday);
            mp.start();
        });

        ImageButton imgSunday = findViewById(R.id.imgSunday);
        imgSunday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.sunday);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(WeatherActivity.this, ColoursActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(WeatherActivity.this, WeatherActivity.class);
        startActivity(i);
    }
}