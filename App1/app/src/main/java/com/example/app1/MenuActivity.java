package com.example.app1;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends ListActivity {


    //Classes
    String[] myCountries = {
            "GreetingsActivity"

    };


    //Labels
    String[] myLabels = {
            "Greetings"

    };


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Binding Array "myLabels" to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(MenuActivity.this, android.R.layout.simple_list_item_1, myLabels));


        //Receive text
        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("Name");
            TextView tvNameReceived = findViewById(R.id.receiveName);
            tvNameReceived.setText("Welcome, " + sentText + "!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        try {
            Class myClass = Class.forName("com.example.basic_functionality." + myCountries[position]);
            Intent i = new Intent(MenuActivity.this, myClass);
            startActivity(i);
        } catch
        (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
