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
        setContentView(R.layout.activity_weather);

        //Sounds
        ImageButton imgTemperature = findViewById(R.id.imgTemperature);
        imgTemperature.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.temperature);
            mp.start();
        });

        ImageButton imgWeatherToday = findViewById(R.id.imgWeatherToday);
        imgWeatherToday.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.weathertoday);
            mp.start();
        });

        ImageButton imgWeatherTomorrow = findViewById(R.id.imgWeatherTomorrow);
        imgWeatherTomorrow.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.weathertomorrow);
            mp.start();
        });

        ImageButton imgStorm = findViewById(R.id.imgStorm);
        imgStorm.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.storm);
            mp.start();
        });

        ImageButton imgHot = findViewById(R.id.imgHot);
        imgHot.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.hot);
            mp.start();
        });

        ImageButton imgCold = findViewById(R.id.imgCold);
        imgCold.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.cold);
            mp.start();
        });

        ImageButton imgSunny = findViewById(R.id.imgSunny);
        imgSunny.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.sunny);
            mp.start();
        });

        ImageButton imgRaining = findViewById(R.id.imgRaining);
        imgRaining.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.raining);
            mp.start();
        });

        ImageButton imgSnowing = findViewById(R.id.imgSnowing);
        imgSnowing.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.snowing);
            mp.start();
        });

        ImageButton imgWindy = findViewById(R.id.imgWindy);
        imgWindy.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.windy);
            mp.start();
        });

        ImageButton imgCloudy = findViewById(R.id.imgCloudy);
        imgCloudy.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.cloudy);
            mp.start();
        });

        ImageButton imgFoggy = findViewById(R.id.imgFoggy);
        imgFoggy.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(WeatherActivity.this, R.raw.foggy);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(WeatherActivity.this, TimeActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(WeatherActivity.this, DirectionsActivity.class);
        startActivity(i);
    }
}