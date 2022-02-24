package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        TextView rv1 = findViewById(R.id.rv1);
        TextView rv2 = findViewById(R.id.rv2);
        TextView rv3 = findViewById(R.id.rv3);
        TextView rv4 = findViewById(R.id.rv4);
        TextView rv5 = findViewById(R.id.rv5);

        try {
            Bundle extras = getIntent().getExtras();
            String sentString = extras.getString("Name");


            if (sentString.charAt(0) == '1') {
                rv1.setVisibility(View.VISIBLE);
            }

            if (sentString.charAt(1) == '1') {
                rv2.setVisibility(View.VISIBLE);
            }

            if (sentString.charAt(2) == '1') {
                rv3.setVisibility(View.VISIBLE);
            }

            if (sentString.charAt(3) == '1') {
                rv4.setVisibility(View.VISIBLE);
            }

            if (sentString.charAt(4) == '1') {
                rv5.setVisibility(View.VISIBLE);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void goDeleteText(View view) {
        TextInputEditText textBox = findViewById(R.id.textBox);
        textBox.setText("");

        Toast.makeText(getBaseContext(), "Thank you for your message.",
                Toast.LENGTH_SHORT).show();

    }

}