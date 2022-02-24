package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);

        Button btnRate2 = findViewById(R.id.btnRate2);
        btnRate2.setOnClickListener(arg0 -> {
            String states = "";
            boolean valid = false;
            Intent i = new Intent(RateActivity.this, ReviewActivity.class);

            if (checkBox.isChecked()) {
                states += "1";
                valid = true;

            } else if (!checkBox.isChecked()) {
                states += "0";
            }

            if (checkBox2.isChecked()) {
                states += "1";
                valid = true;

            } else if (!checkBox2.isChecked()) {
                states += "0";
            }

            if (checkBox3.isChecked()) {
                states += "1";
                valid = true;

            } else if (!checkBox3.isChecked()) {
                states += "0";
            }

            if (checkBox4.isChecked()) {
                states += "1";
                valid = true;

            } else if (!checkBox4.isChecked()) {
                states += "0";
            }

            if (checkBox5.isChecked()) {
                states += "1";
                valid = true;

            } else if (!checkBox5.isChecked()) {
                states += "0";
            }


            if (valid) {
                i.putExtra("Name", states);
                startActivity(i);
            } else {
                Toast.makeText(getBaseContext(), "Please select at least one box.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}