package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        //Sounds
        ImageButton imgArrivals = findViewById(R.id.imgArrivals);
        imgArrivals.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.arrivals);
            mp.start();
        });

        ImageButton imgDepartures = findViewById(R.id.imgDepartures);
        imgDepartures.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.departures);
            mp.start();
        });

        ImageButton imgEntrance = findViewById(R.id.imgEntrance);
        imgEntrance.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.entrance);
            mp.start();
        });


        ImageButton imgExit = findViewById(R.id.imgExit);
        imgExit.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.exit);
            mp.start();
        });

        ImageButton imgNoEntry = findViewById(R.id.imgNoEntry);
        imgNoEntry.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.noentry);
            mp.start();
        });

        ImageButton imgNoParking = findViewById(R.id.imgNoParking);
        imgNoParking.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.noparking);
            mp.start();
        });

        ImageButton imgNoSmoking = findViewById(R.id.imgNoSmoking);
        imgNoSmoking.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.nosmoking);
            mp.start();
        });

        ImageButton imgOpen = findViewById(R.id.imgOpen);
        imgOpen.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.open);
            mp.start();
        });

        ImageButton imgClosed = findViewById(R.id.imgClosed);
        imgClosed.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.closed);
            mp.start();
        });

        ImageButton imgToilets = findViewById(R.id.imgToilets);
        imgToilets.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.toilets);
            mp.start();
        });

        ImageButton imgFreeAdmission = findViewById(R.id.imgFreeAdmission);
        imgFreeAdmission.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.freeadmission);
            mp.start();
        });

        ImageButton imgBeCareful = findViewById(R.id.imgBeCareful);
        imgBeCareful.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(InformationActivity.this, R.raw.becareful);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(InformationActivity.this, DirectionsActivity.class);
        startActivity(i);
    }
}