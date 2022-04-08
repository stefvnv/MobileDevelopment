package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HoroscopeDetailsActivity extends AppCompatActivity {

    TextView horoscopeTitle;

    TextView dateRange;
    TextView currentDate;
    TextView description;
    TextView compatibility;
    TextView mood;
    TextView color;
    TextView luckyNumber;
    TextView luckyTime;


    //TextView horoscopeText;
    String pooop;


    private Fish delish = new Fish();

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_horoscope_details);

        horoscopeTitle = findViewById(R.id.horoscopeTitle);
        dateRange = findViewById(R.id.dateRange);
        currentDate = findViewById(R.id.currentDate);
        description = findViewById(R.id.description);
        compatibility = findViewById(R.id.compatibilityText);
        mood = findViewById(R.id.moodText);
        color = findViewById(R.id.colorText);
        luckyNumber = findViewById(R.id.numberText);
        luckyTime = findViewById(R.id.timeText);


        //horoscopeText = findViewById(R.id.horoscopeText);


        String zodiacName = getIntent().getStringExtra("zodiacName");

        populateHoroscope(zodiacName);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        delish.foStuff(pooop);

        horoscopeTitle.setText(zodiacName);
        dateRange.setText(delish.getDate_range());
        currentDate.setText(delish.getCurrent_date());
        description.setText(delish.getDescription());
        compatibility.setText(delish.getCompatibility());
        mood.setText(delish.getMood());
        color.setText(delish.getColor());
        luckyNumber.setText(delish.getLucky_number());
        luckyTime.setText(delish.getLucky_time());

        //horoscopeText.setText(delish.getDescription());

    }


    private void populateHoroscope(String zodiacName) {
        Thread threadRun = new Thread() {

            public void run() {
                OkHttpClient client = new OkHttpClient();
                RequestBody requestBody = RequestBody.create(null, new byte[0]);

                Request request = new Request.Builder()
                        .url("https://sameer-kumar-aztro-v1.p.rapidapi.com/?sign=" + zodiacName + "&day=today")
                        .post(requestBody)
                        .addHeader("X-RapidAPI-Host", "sameer-kumar-aztro-v1.p.rapidapi.com")
                        .addHeader("X-RapidAPI-Key", "f1b4c9f622msh1660ebad06a3ff6p15e847jsn35f5cb2b40c5")
                        .build();

                Response response;
                {
                    try {
                        response = client.newCall(request).execute();
                        pooop = response.body().string();
                    } catch (IOException | NullPointerException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        threadRun.start();
    }
}