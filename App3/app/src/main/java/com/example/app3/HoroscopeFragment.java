package com.example.app3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HoroscopeFragment extends Fragment {
    /**
    RecyclerView recyclerViewIn;
    ImageView imageViewIn;
    HoroscopeAdapter horoscopeAdapter;
     **/

    //for horoscope
    private final List<HoroscopeData> horoscopeDataList = new ArrayList<>();
    private RecyclerView recyclerViewIn;
    ImageView imageViewIn;
    HoroscopeAdapter horoscopeAdapter;
    RecyclerView.LayoutManager manager;
    String[] zodiacArray;
    HoroscopeData horoscopeData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_horoscope, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        super.onViewCreated(view, savedInstanceState);
        recyclerViewIn = view.findViewById(R.id.recycler_view);
        imageViewIn = view.findViewById(R.id.imageView);
        prepareHoroscopeData();
    }
    //Horoscope Methods
    private void prepareHoroscopeData() {

        horoscopeAdapter = new HoroscopeAdapter(getActivity(), horoscopeDataList);
        manager = new GridLayoutManager(getActivity(), 2);

        recyclerViewIn.setLayoutManager(manager);
        recyclerViewIn.setAdapter(horoscopeAdapter);

        zodiacArray = new String[]{"Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};

        horoscopeData = new HoroscopeData("ARIES", "ariesimg", imageViewIn);
        horoscopeDataList.add(horoscopeData);

        for (String zodiac : zodiacArray) {
            horoscopeData = new HoroscopeData(zodiac.toUpperCase(), zodiac.toLowerCase() + "img", imageViewIn);
            horoscopeDataList.add(horoscopeData);
        }
    }

}
