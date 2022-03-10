package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.ByteArrayOutputStream;

public class MoltenActivity extends AppCompatActivity {

    private SharedPreferences notes;
    private SharedPreferences image;
    private SharedPreferences mode;
    private SharedPreferences tick;

    private ViewFlipper viewFlipper;
    private TextView textViewSaved;
    private EditText editTextNotes;
    private Button btnSave;
    private Button btnClear;
    private Button btnCapture;
    private Button btnDelete;

    private Menu optionsMenu;
    private MenuItem menuItem;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    String txt = "";
    boolean ticked;
    boolean darkModeEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molten);

        viewFlipper = findViewById(R.id.view_flipper);

        editTextNotes = findViewById(R.id.editText_notes);
        textViewSaved = findViewById(R.id.textView_saved);
        btnSave = findViewById(R.id.btn_save);
        btnClear = findViewById(R.id.btn_clear);

        btnCapture = findViewById(R.id.btn_capture);
        imageView = findViewById(R.id.imageView);

        //Shared Preferences
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt = editTextNotes.getText().toString();
                textViewSaved.setText(txt);

                notes = getSharedPreferences("saved notes", MODE_PRIVATE);
                SharedPreferences.Editor editor = notes.edit();
                txt = notes.getString("text", "") + "• " + txt + "\n\n";
                textViewSaved.setText(txt);
                editor.putString("text", textViewSaved.getText().toString());
                editor.apply();
            }
        });
        getShared();


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewSaved.getText().toString().equals("")) {
                    Toast.makeText(MoltenActivity.this, "There are no notes to be cleared.", Toast.LENGTH_SHORT).show();
                } else {
                    textViewSaved.setText("");

                    notes = getSharedPreferences("saved notes", MODE_PRIVATE);
                    SharedPreferences.Editor editor = notes.edit();
                    txt = notes.getString("text", "") + "";
                    textViewSaved.setText("");
                    editor.putString("text", textViewSaved.getText().toString());
                    editor.apply();
                }
            }
        });
        getShared();
        modeOnCreate();


        //Camera
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                try {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                    // imageView.setVisibility(View.VISIBLE);
                } catch (ActivityNotFoundException e) {
                    // display error state to the user
                }
            }
        });
    }


    public void getShared() {
        SharedPreferences notes = getSharedPreferences("saved notes", MODE_PRIVATE);
        txt = notes.getString("text", "");
        textViewSaved.setText(txt);
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


    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.my_menu, menu);
        optionsMenu = menu;
        menuItem = optionsMenu.findItem(R.id.complete);
        getSharedTicked(menuItem, true);
        //onOptionsItemSelected(menuItem);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        String bgColour;

        //Light/Dark mode icon
        if (id == R.id.mode) {
            modeOnClick();
            return true;
        }

        //Complete icon
        if (id == R.id.complete) {
            getSharedTicked(item);
        }
        return super.onOptionsItemSelected(item);
    }

    public void modeOnCreate() {
        View view = this.getWindow().getDecorView();
        //Shared Preferences

        mode = getApplicationContext().getSharedPreferences("darkModeSetting", MODE_PRIVATE);

        darkModeEnabled = mode.getBoolean("isDarkEnabled", false);

        if (darkModeEnabled) {
            view.setBackgroundColor(0xFF000000);

        } else {
            view.setBackgroundColor(0xFFFFFFFF);

        }


    }

    public void modeOnClick() {
        View view = this.getWindow().getDecorView();
        //Shared Preferences

        mode = getApplicationContext().getSharedPreferences("darkModeSetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = mode.edit();

        darkModeEnabled = mode.getBoolean("isDarkEnabled", false);

        darkModeEnabled = !darkModeEnabled;

        if (darkModeEnabled) {
            view.setBackgroundColor(0xFF000000);

            Toast.makeText(this, "Theme changed to dark mode.", Toast.LENGTH_SHORT).show();
        } else {
            view.setBackgroundColor(0xFFFFFFFF);

            Toast.makeText(this, "Theme changed to light mode.", Toast.LENGTH_SHORT).show();
        }


        editor.putBoolean("isDarkEnabled", darkModeEnabled);
        editor.apply();

    }


    public void getSharedTicked(MenuItem item) {
        tick = getSharedPreferences("tick state", MODE_PRIVATE);
        SharedPreferences.Editor editor = tick.edit();
        ticked = tick.getBoolean("isItTicked", false);
        ticked = !ticked;
        if (ticked) {
            item.setIcon(R.drawable.ticked);
            Toast.makeText(this, "This recipe marked as complete.", Toast.LENGTH_SHORT).show();
        } else {
            item.setIcon(R.drawable.circle);
            Toast.makeText(this, "This recipe marked as incomplete.", Toast.LENGTH_SHORT).show();
        }
        editor.putBoolean("isItTicked", ticked);
        editor.apply();
    }

    public void getSharedTicked(MenuItem item, boolean comingFromMain) {
        SharedPreferences contextTick = getSharedPreferences("tick state", MODE_PRIVATE);
        ticked = contextTick.getBoolean("isItTicked", false);

        if (ticked) {
            item.setIcon(R.drawable.ticked);
        } else {
            item.setIcon(R.drawable.circle);
        }
    }


    //Camera
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);
        }
    }


    //Transitions (when back is pressed)
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }
}