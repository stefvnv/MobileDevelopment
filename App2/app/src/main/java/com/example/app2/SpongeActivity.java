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

public class SpongeActivity extends AppCompatActivity {
    private SharedPreferences preferences;
    private ViewFlipper viewFlipper;

    private TextView textViewSaved;
    private EditText editTextNotes;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    String txt = "";
    boolean ticked;
    boolean darkModeEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponge);

        viewFlipper = findViewById(R.id.view_flipper);

        editTextNotes = findViewById(R.id.editText_notes);
        textViewSaved = findViewById(R.id.textView_saved);
        Button btnSave = findViewById(R.id.btn_save);
        Button btnClear = findViewById(R.id.btn_clear);

        Button btnCapture = findViewById(R.id.btn_capture);
        imageView = findViewById(R.id.imageView);

        //Shared Preferences
        btnSave.setOnClickListener(view -> {
            txt = editTextNotes.getText().toString();
            textViewSaved.setText(txt);

            preferences = getSharedPreferences("notes_sponge", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            txt = preferences.getString("text", "") + "• " + txt + "\n\n";
            textViewSaved.setText(txt);
            editor.putString("text", textViewSaved.getText().toString());
            editor.apply();
        });
        getShared();


        btnClear.setOnClickListener(view -> {
            if (textViewSaved.getText().toString().equals("")) {
                Toast.makeText(SpongeActivity.this, "There are no notes to be cleared.", Toast.LENGTH_SHORT).show();
            } else {
                textViewSaved.setText("");

                preferences = getSharedPreferences("notes_sponge", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                txt = preferences.getString("text", "") + "";
                textViewSaved.setText("");
                editor.putString("text", textViewSaved.getText().toString());
                editor.apply();
            }
        });
        getShared();
        modeOnCreate();


        //Camera
        btnCapture.setOnClickListener(view -> {
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            try {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                imageView.setVisibility(View.VISIBLE);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(SpongeActivity.this, "Capturing image failed.", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void getShared() {
        SharedPreferences preferences = getSharedPreferences("notes_sponge", MODE_PRIVATE);
        txt = preferences.getString("text", "");
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
        getMenuInflater().inflate(R.menu.my_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.complete);
        getSharedTicked(menuItem, true);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

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
        preferences = getApplicationContext().getSharedPreferences("darkModeSetting", MODE_PRIVATE);
        darkModeEnabled = preferences.getBoolean("isDarkEnabled", false);

        if (darkModeEnabled) {
            view.setBackgroundColor(0xFF222222);
        } else {
            view.setBackgroundColor(0xFFFFFFFF);
        }
    }

    public void modeOnClick() {
        View view = this.getWindow().getDecorView();

        //Shared Preferences
        preferences = getApplicationContext().getSharedPreferences("darkModeSetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        darkModeEnabled = preferences.getBoolean("isDarkEnabled", false);
        darkModeEnabled = !darkModeEnabled;

        if (darkModeEnabled) {
            view.setBackgroundColor(0xFF222222);
            Toast.makeText(this, "Theme changed to dark mode.", Toast.LENGTH_SHORT).show();
        } else {
            view.setBackgroundColor(0xFFFFFFFF);
            Toast.makeText(this, "Theme changed to light mode.", Toast.LENGTH_SHORT).show();
        }
        editor.putBoolean("isDarkEnabled", darkModeEnabled);
        editor.apply();
    }


    public void getSharedTicked(MenuItem item) {
        preferences = getSharedPreferences("tick_sponge", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        ticked = preferences.getBoolean("isItTicked", false);
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
        SharedPreferences contextTick = getSharedPreferences("tick_sponge", MODE_PRIVATE);
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