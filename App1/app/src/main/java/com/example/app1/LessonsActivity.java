package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        WebView myBrowser = findViewById(R.id.webView);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("https://www.thespanishexperiment.com/learn-spanish");
    }
}