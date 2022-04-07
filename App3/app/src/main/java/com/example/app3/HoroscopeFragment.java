package com.example.app3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HoroscopeFragment extends Fragment {
    private final List<HoroscopeData> horoscopeDataList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_horoscope, container, false);

    }

       // @Override
        //public void onCreate(Bundle savedInstanceState) {
           // super.onCreate(savedInstanceState);


            //
            //requestWindowFeature(Window.FEATURE_NO_TITLE);
            //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //Objects.requireNonNull(getSupportActionBar()).hide();

            //prepareHoroscopeData();
            //
        //}


        /**
        private void prepareHoroscopeData() {
            RecyclerView recyclerView = findViewById(R.id.recycler_view);
            ImageView imageView = findViewById(R.id.imageView);

            HoroscopeAdapter horoscopeAdapter = new HoroscopeAdapter(this, horoscopeDataList);
            RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 2);
            recyclerView.setLayoutManager(manager);
            recyclerView.setAdapter(horoscopeAdapter);

            String[] zodiacArray = {"Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};

            HoroscopeData horoscopeData = new HoroscopeData("ARIES", "ariesImg", imageView);
            horoscopeDataList.add(horoscopeData);

            for (String zodiac : zodiacArray) {
                horoscopeData = new HoroscopeData(zodiac.toUpperCase(), zodiac.toLowerCase() + "img", imageView);
                horoscopeDataList.add(horoscopeData);
            }

        }
         **/

       // ((HoroscopeActivity) getActivity()).prepareHoroscopeData();

}
