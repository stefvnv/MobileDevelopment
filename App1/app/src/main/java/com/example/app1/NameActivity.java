package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        //Pass Text
        editName = findViewById(R.id.editName);
        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(arg0 -> {
            Intent i = new Intent(NameActivity.this, MenuActivity.class);
            String thename = editName.getText().toString();
            i.putExtra("Name", thename);
            startActivity(i);
        });
    }
}