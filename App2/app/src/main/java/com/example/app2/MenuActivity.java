package com.example.app2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class MenuActivity extends ListActivity {
    private static final String[] myDesserts = {
            "MoltenActivity",
            "FrangipaneActivity",
            "SpongeActivity",
            "TiffinActivity",
            "CheesecakeActivity",
            "PannaCottaActivity",
            "CobblerActivity",
            "BananaPieActivity",
            "TartActivity",
            "TiramisuActivity"

    };

    private static final String[] myLabels = {
            "Chocolate Molten Cakes",
            "Cherry & Almond Frangipane Galette",
            "Lemon Sponge Cake",
            "Chocolate Tiffin",
            "White Chocolate Cheesecake",
            "Vanilla Panna Cotta",
            "Ultimate Plum & Apple Cobbler",
            "Butterscotch Banana Pie",
            "Black Forest Tart",
            "Tiramisu"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setListAdapter(new MyOwnAdapter());
    }

    class MyOwnAdapter extends ArrayAdapter<String> {
        MyOwnAdapter() {
            super(MenuActivity.this, R.layout.my_row, R.id.label, myLabels);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row = super.getView(position, convertView, parent);
            ImageView icon = (ImageView) row.findViewById(R.id.icon);


            if (myDesserts[position].equals("MoltenActivity"))
                icon.setImageResource(R.drawable.moltencakes);
            if (myDesserts[position].equals("FrangipaneActivity"))
                icon.setImageResource(R.drawable.frangipane);
            if (myDesserts[position].equals("SpongeActivity"))
                icon.setImageResource(R.drawable.sponge);
            if (myDesserts[position].equals("TiffinActivity"))
                icon.setImageResource(R.drawable.tiffin);
            if (myDesserts[position].equals("CheesecakeActivity"))
                icon.setImageResource(R.drawable.cheesecake);
            if (myDesserts[position].equals("PannaCottaActivity"))
                icon.setImageResource(R.drawable.pannacotta);
            if (myDesserts[position].equals("CobblerActivity"))
                icon.setImageResource(R.drawable.cobbler);
            if (myDesserts[position].equals("BananaPieActivity"))
                icon.setImageResource(R.drawable.bananapie);
            if (myDesserts[position].equals("TartActivity"))
                icon.setImageResource(R.drawable.tart);
            if (myDesserts[position].equals("TiramisuActivity"))
                icon.setImageResource(R.drawable.tiramisu);

            return (row);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        try {
            Class myClass = Class.forName("com.example.app2." + myDesserts[position]);
            Intent i = new Intent(MenuActivity.this, myClass);
            startActivity(i);
        } catch
        (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }
}