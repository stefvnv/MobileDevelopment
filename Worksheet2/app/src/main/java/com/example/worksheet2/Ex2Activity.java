package com.example.worksheet2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ex2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        //Webview
        WebView myBrowser = findViewById(R.id.webView);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("https://www.google.ie");
    }


    public void showEclipse(View view) {
        WebView myBrowser = findViewById(R.id.webView);
        myBrowser.loadUrl("https://www.eclipse.org/");
        //startActivity(i);
    }

    public void showIntellij(View view) {
        WebView myBrowser = findViewById(R.id.webView);
        myBrowser.loadUrl("https://www.jetbrains.com/lp/intellij-frameworks/");
        //startActivity(i);
    }
}