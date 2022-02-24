package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    //Radio Group
    public void goCity(View v) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();

        if (selectedId == R.id.barcelona) {
            Intent i = new Intent(AboutActivity.this, BarcelonaActivity.class);
            startActivity(i);
        } else if (selectedId == R.id.madrid) {
            Intent i = new Intent(AboutActivity.this, MadridActivity.class);
            startActivity(i);
        } else if (selectedId == R.id.seville) {
            Intent i = new Intent(AboutActivity.this, SevilleActivity.class);
            startActivity(i);
        } else if (selectedId == R.id.palma) {
            Intent i = new Intent(AboutActivity.this, PalmaActivity.class);
            startActivity(i);
        } else if (selectedId == R.id.granada) {
            Intent i = new Intent(AboutActivity.this, GranadaActivity.class);
            startActivity(i);
        } else if (selectedId == R.id.other) {
            Intent i = new Intent(AboutActivity.this, OtherActivity.class);
            startActivity(i);
        }
    }
}
