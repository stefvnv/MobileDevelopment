package com.example.app1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Receive text
        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("Name");
            TextView tvNameReceived = findViewById(R.id.receiveName);
            tvNameReceived.setText("Welcome, " + sentText + "!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    //Easy Button Clicks
    public void goAboutActivity(View view) {
        Intent i = new Intent(MenuActivity.this, AboutActivity.class);
        startActivity(i);
    }

    public void goLearnActivity(View view) {
        Intent i = new Intent(MenuActivity.this, LearnActivity.class);
        startActivity(i);
    }

    public void goRateActivity(View view) {
        Intent i = new Intent(MenuActivity.this, RateActivity.class);
        startActivity(i);
    }
}
