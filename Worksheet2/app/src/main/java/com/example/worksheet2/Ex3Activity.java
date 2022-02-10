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
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:53.420105,-7.906492"));
        startActivity(i);
    }

    public void openPhone (View view) {
        final EditText phoneNo = findViewById(R.id.numberText);

        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + phoneNo));
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
    }


}