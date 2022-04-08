package com.example.app3;

import android.app.DatePickerDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class FindActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    Button findButton;
    TextView signText;
    TextView signTextDesc;
    String toSet = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        findButton = findViewById(R.id.findButton);
        signText = findViewById(R.id.signText);
        signTextDesc = findViewById(R.id.signTextDesc);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(FindActivity.this,
                        FindActivity.this, year, month, day);
                datePickerDialog.show();

            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        signText.setText(getSign(day, month));
        signTextDesc.setText(toSet);

    }

    private String getSign(int day, int month) {
        String sign = "";


        if (month == 0) {
            if (day < 20) {
                sign = "Capricorn";
                toSet = getResources().getString(R.string.capricorn_desc);
            } else {
                sign = "Aquarius";
                toSet = getResources().getString(R.string.aquarius_desc);
            }
        } else if (month == 1) {
            if (day < 20) {
                sign = "Aquarius";
                toSet = getResources().getString(R.string.aquarius_desc);
            } else {
                sign = "Pisces";
                toSet = getResources().getString(R.string.pisces_desc);
            }
        } else if (month == 2) {
            if (day < 20) {
                sign = "Pisces";
                toSet = getResources().getString(R.string.pisces_desc);
            } else {
                sign = "Aries";
                toSet = getResources().getString(R.string.aries_desc);
            }
        } else if (month == 3) {
            if (day < 20) {
                sign = "Aries";
                toSet = getResources().getString(R.string.aries_desc);
            } else {
                sign = "Taurus";
                toSet = getResources().getString(R.string.taurus_desc);
            }
        } else if (month == 4) {
            if (day < 20) {
                sign = "Taurus";
                toSet = getResources().getString(R.string.taurus_desc);
            } else {
                sign = "Gemini";
                toSet = getResources().getString(R.string.gemini_desc);
            }
        } else if (month == 5) {
            if (day < 20) {
                sign = "Gemini";
                toSet = getResources().getString(R.string.gemini_desc);
            } else {
                sign = "Cancer";
                toSet = getResources().getString(R.string.cancer_desc);
            }
        } else if (month == 6) {
            if (day < 20) {
                sign = "Cancer";
                toSet = getResources().getString(R.string.cancer_desc);
            } else {
                sign = "Leo";
                toSet = getResources().getString(R.string.leo_desc);
            }
        } else if (month == 7) {
            if (day < 20) {
                sign = "Leo";
                toSet = getResources().getString(R.string.leo_desc);
            } else {
                sign = "Virgo";
                toSet = getResources().getString(R.string.virgo_desc);
            }
        } else if (month == 8) {
            if (day < 20) {
                sign = "Virgo";
                toSet = getResources().getString(R.string.virgo_desc);
            } else {
                sign = "Libra";
                toSet = getResources().getString(R.string.libra_desc);
            }
        } else if (month == 9) {
            if (day < 20) {
                sign = "Libra";
                toSet = getResources().getString(R.string.libra_desc);
            } else {
                sign = "Scorpio";
                toSet = getResources().getString(R.string.scorpio_desc);
            }
        } else if (month == 10) {
            if (day < 20) {
                sign = "Scorpio";
                toSet = getResources().getString(R.string.scorpio_desc);
            } else {
                sign = "Sagittarius";
                toSet = getResources().getString(R.string.sagittarius_desc);
            }
        } else if (month == 11) {
            if (day < 20) {
                sign = "Sagittarius";
                toSet = getResources().getString(R.string.sagittarius_desc);
            } else {
                sign = "Capricorn";
                toSet = getResources().getString(R.string.capricorn_desc);
            }
        }
        return sign;
    }
}