package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Sounds
        ImageButton imgName = findViewById(R.id.imgName);
        imgName.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.name);
            mp.start();
        });

        ImageButton imgSurname = findViewById(R.id.imgSurname);
        imgSurname.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.surname);
            mp.start();
        });

        ImageButton imgAge = findViewById(R.id.imgAge);
        imgAge.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.age);
            mp.start();
        });

        ImageButton imgSex = findViewById(R.id.imgSex);
        imgSex.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.sex);
            mp.start();
        });

        ImageButton imgAddress = findViewById(R.id.imgAddress);
        imgAddress.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.address);
            mp.start();
        });

        ImageButton imgDOB = findViewById(R.id.imgDOB);
        imgDOB.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.dob);
            mp.start();
        });

        ImageButton imgNationality = findViewById(R.id.imgNationality);
        imgNationality.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.nationality);
            mp.start();
        });

        ImageButton imgEducation = findViewById(R.id.imgEducation);
        imgEducation.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.education);
            mp.start();
        });

        ImageButton imgOccupation = findViewById(R.id.imgOccupation);
        imgOccupation.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.occupation);
            mp.start();
        });

        ImageButton imgMarital = findViewById(R.id.imgMarital);
        imgMarital.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.marital);
            mp.start();
        });

        ImageButton imgID = findViewById(R.id.imgID);
        imgID.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.id);
            mp.start();
        });

        ImageButton imgDriving = findViewById(R.id.imgDriving);
        imgDriving.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.driving);
            mp.start();
        });

        ImageButton imgPassport = findViewById(R.id.imgPassport);
        imgPassport.setOnClickListener(View -> {
            MediaPlayer mp = MediaPlayer.create(DetailsActivity.this, R.raw.passport);
            mp.start();
        });
    }

    //Easy Button Click
    public void goPreviousActivity(View view) {
        Intent i = new Intent(DetailsActivity.this, ConversationActivity.class);
        startActivity(i);
    }

    public void goNextActivity(View view) {
        Intent i = new Intent(DetailsActivity.this, ColoursActivity.class);
        startActivity(i);
    }
}