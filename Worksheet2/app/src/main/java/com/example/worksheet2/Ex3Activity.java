package com.example.worksheet2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ex3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
    }

    public void openMap (View view) {
        EditText longitude = findViewById(R.id.browserText);
        EditText latitude = findViewById(R.id.latitudeText3);

        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:" + longitude.getText().toString() + "," + latitude.getText().toString()));
        startActivity(i);
    }

    public void openPhone (View view) {
        EditText phoneNo = findViewById(R.id.numberText);

        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + phoneNo.getText().toString()));
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
    }
}