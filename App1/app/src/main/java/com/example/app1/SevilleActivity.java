package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SevilleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seville);

        //Java Button Clicks
        Button btnLocation = findViewById(R.id.btnLocation);
        Button btnWebsite = findViewById(R.id.btnWebsite);
        Button btnCall = findViewById(R.id.btnCall);


        //Intents
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:37.38638200083731, -5.9891384256813165"));
                startActivity(i);
            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://casadelpoeta.es/en/boutique-hotel/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "+34954213868"));
                if (i.resolveActivity(getPackageManager()) != null)
                    startActivity(i);
            }
        });
    }

    //Switch Vector (Image) Asset
    public void goLeftVector(View view) {
        ImageView imageView = findViewById(R.id.imgMain);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.sevillefour);
            imageView.setTag("4");
        } else if (resource.equalsIgnoreCase("4")) {
            imageView.setImageResource(R.drawable.sevillethree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.sevilletwo);
            imageView.setTag("2");
        } else {
            imageView.setImageResource(R.drawable.sevilleone);
            imageView.setTag("1");
        }
    }

    public void goRightVector(View view) {
        ImageView imageView = findViewById(R.id.imgMain);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.sevilletwo);
            imageView.setTag("2");
        } else if (resource.equalsIgnoreCase("2")) {
            imageView.setImageResource(R.drawable.sevillethree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.sevillefour);
            imageView.setTag("4");
        } else {
            imageView.setImageResource(R.drawable.sevilleone);
            imageView.setTag("1");
        }
    }
}