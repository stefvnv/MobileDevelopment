package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goMenu(View v) {
        Intent i = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.fade_in,R.transition.fade_out);
    }
}