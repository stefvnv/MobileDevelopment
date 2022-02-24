package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class CordobaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordoba);

        VideoView vd = findViewById(R.id.videoView4);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cordoba);
        MediaController mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();
        vd.setVideoURI(uri);
        vd.start();
    }
}