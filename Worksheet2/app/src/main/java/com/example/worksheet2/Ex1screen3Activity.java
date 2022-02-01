package com.example.worksheet2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ex1screen3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1screen3);
    }

    public void goScreen2(View view) {
        Intent i = new Intent(Ex1screen3Activity.this, Ex1screen2Activity.class);
        startActivity(i);
    }
}