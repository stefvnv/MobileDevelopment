package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void goCity(View v) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioCity = (RadioButton) findViewById(selectedId);

        if(selectedId == R.id.barcelona) {
            Intent i = new Intent(AboutActivity.this, BarcelonaActivity.class);
            startActivity(i);
            // }else if (selectedId == R.id.)
        }
    }
}