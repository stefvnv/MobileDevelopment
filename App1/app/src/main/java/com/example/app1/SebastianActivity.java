package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SebastianActivity extends AppCompatActivity {

    private MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebastian);

        VideoView vd = findViewById(R.id.videoView3);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sebastian);
        mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();
        vd.setVideoURI(uri);
        vd.start();
    }
}