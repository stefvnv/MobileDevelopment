package com.example.app1;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class LearnActivity extends ListActivity {
    String[] myList = {
            "GreetingsActivity",
            "ConversationActivity",
            "DetailsActivity"
    };


    String[] myLabels = {
            "Greetings",
            "General Conversation",
            "Personal Details"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding Array "myLabels" to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(LearnActivity.this, android.R.layout.simple_list_item_1, myLabels));
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.example.app1." + myList[position]);
            Intent i = new Intent(LearnActivity.this, myClass);
            startActivity(i);
        } catch
        (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
