package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class HoroscopeDetailsActivity extends AppCompatActivity {
    TextView textView;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_horoscope_details);

        textView = findViewById(R.id.horoscopeText);
        String zodiacName = getIntent().getStringExtra("zodiacName");

        populateHoroscope(zodiacName);
    }


    private void populateHoroscope(String zodiacName) {

        //Instantiate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);
       // String url = "https://sameer-kumar-aztro-v1.p.rapidapi.com/?sign=" + zodiacName + "&day=today";
        String url = "https://sameer-kumar-aztro-v1.p.rapidapi.com/?sign=aquarius&day=today";

        //Request a string response from the URL

        //StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        textView.setText("Response is: " + response.substring(0, 500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("That didn't work!");
            }
        }
        ) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("X-RapidAPI-Host", "sameer-kumar-aztro-v1.p.rapidapi.com");
                params.put("X-RapidAPI-Key", "f1b4c9f622msh1660ebad06a3ff6p15e847jsn35f5cb2b40c5");
                //params.put("x-vacationtoken", "secret_token");
                //params.put("content-type", "application/json");
                //params.put("x-vacationtoken", "secret_token");
                return params;
            }
        };
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}