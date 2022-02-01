package com.example.worksheet2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Ex1screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1screen2);
    }

    public void goScreen1(View view) {
        Intent i = new Intent(Ex1screen2Activity.this, Ex1Activity.class);
        startActivity(i);
    }

    public void goScreen3(View view) {
        Intent i = new Intent(Ex1screen2Activity.this, Ex1screen3Activity.class);
        startActivity(i);
    }
}