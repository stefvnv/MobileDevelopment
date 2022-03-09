package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MoltenActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private SharedPreferences notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molten);
        viewFlipper = findViewById(R.id.view_flipper);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        String bgColour;

        if (id == R.id.mode) {

            //Shared Preferences



            Toast.makeText(this, "Test 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //View Flipper
    public void goPrevious(View view){
        viewFlipper.setInAnimation(this, R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_right);
        viewFlipper.showPrevious();
    }

    public void goNext(View view){
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_left);
        viewFlipper.showNext();
    }




    //Shared Preferences
    public void goSave(View v){

        notes = getApplicationContext().getSharedPreferences("notes", MODE_PRIVATE);
        EditText myNotes =  findViewById(R.id.editText_notes);
        String txt = myNotes.getText().toString();

        SharedPreferences.Editor editor = notes.edit();
        editor.putString("key_notes", txt);
        editor.commit();

        Toast.makeText(getBaseContext(), "Note saved successfully.", Toast.LENGTH_SHORT).show();

        String note = notes.getString("key_notes", null);


        //String sentText = extras.getString("Name");
        myNotes.setVisibility(View.VISIBLE);
        myNotes.setText(note);


    }

    public void goShow(View v){
        notes = getApplicationContext().getSharedPreferences("notes", MODE_PRIVATE);

        String name = notes.getString("key_name", null);
        Toast.makeText(getBaseContext(), name, Toast.LENGTH_SHORT).show();

    }










    //Transitions (when back is pressed)
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }
}