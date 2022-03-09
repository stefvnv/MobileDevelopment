package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MoltenActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private TextView noteOutput;
    private EditText myNotes;
    private Button okay;
    String txt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molten);
        myNotes = findViewById(R.id.editText_notes);
        noteOutput = findViewById(R.id.textView_saved);
        okay = findViewById(R.id.btn_save);

        okay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                txt = myNotes.getText().toString();
                noteOutput.setText(txt);
                SharedPreferences notes = getSharedPreferences("saved notes", MODE_PRIVATE);
                SharedPreferences.Editor editor = notes.edit();
                editor.putString("text", noteOutput.getText().toString());
                editor.apply();

            }
        });
        doStuff();
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
    public void goPrevious(View view) {
        viewFlipper.setInAnimation(this, R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_right);
        viewFlipper.showPrevious();
    }

    public void goNext(View view) {
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_left);
        viewFlipper.showNext();
    }

    public void doStuff() {
        SharedPreferences notes = getSharedPreferences("saved notes", MODE_PRIVATE);
        txt = notes.getString("text", "");
        noteOutput.setText(txt);
    }

    //Transitions (when back is pressed)
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }
}