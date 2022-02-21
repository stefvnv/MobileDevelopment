package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TenerifeActivity extends AppCompatActivity {

    private MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenerife);

        VideoView vd = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tenerife);
        mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();
        vd.setVideoURI(uri);
        vd.start();
    }
}