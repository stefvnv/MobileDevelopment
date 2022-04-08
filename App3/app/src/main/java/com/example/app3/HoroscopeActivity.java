package com.example.app3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HoroscopeActivity extends AppCompatActivity {
    private final List<HoroscopeData> horoscopeDataList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_horoscope);

        prepareHoroscopeData();
        //
    }


    private void prepareHoroscopeData() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ImageView imageView = findViewById(R.id.imageView);

        HoroscopeAdapter horoscopeAdapter = new HoroscopeAdapter(this, horoscopeDataList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(horoscopeAdapter);

        String[] zodiacArray = {"Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};

        HoroscopeData horoscopeData = new HoroscopeData("ARIES", "ariesimg", imageView);
        horoscopeDataList.add(horoscopeData);

        for (String zodiac : zodiacArray) {
            horoscopeData = new HoroscopeData(zodiac.toUpperCase(), zodiac.toLowerCase() + "img", imageView);
            horoscopeDataList.add(horoscopeData);
        }
    }
}