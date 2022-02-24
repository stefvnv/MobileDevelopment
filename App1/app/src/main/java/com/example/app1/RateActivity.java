package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
    }

    public void goCheckBox(View v) {
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        if (checkBox.isChecked())
            Toast.makeText(getBaseContext(), "We are glad you loved our app!",
                    Toast.LENGTH_SHORT).show();
        else if (checkBox2.isChecked())
            Toast.makeText(getBaseContext(), "We are happy you enjoyed our app.",
                    Toast.LENGTH_SHORT).show();
        else if (checkBox3.isChecked())
            Toast.makeText(getBaseContext(), "We are working on improving Spaniscape.",
                    Toast.LENGTH_SHORT).show();
        else if (checkBox4.isChecked())
            Toast.makeText(getBaseContext(), "We are sorry Spaniscape was not what you expected.",
                    Toast.LENGTH_SHORT).show();
        else if (checkBox5.isChecked())
            Toast.makeText(getBaseContext(), "We are sorry that you did not enjoy Spaniscape. We are hard working on improving it.",
                    Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getBaseContext(), "Check a box to rate the app",
                    Toast.LENGTH_SHORT).show();

    }
}