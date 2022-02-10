package com.example.worksheet2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class SimpleBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplebrowser);

        final WebView myBrowser = findViewById(R.id.webView);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("https://www.google.ie");


        final EditText et = findViewById(R.id.browserText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myText = et.getText().toString();
                myBrowser.loadUrl(myText);
            }
        });
    }
}