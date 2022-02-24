package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PalmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palma);

        //Java Button Clicks
        Button btnLocation = findViewById(R.id.btnLocation);
        Button btnWebsite = findViewById(R.id.btnWebsite);
        Button btnCall = findViewById(R.id.btnCall);


        //Intents
        btnLocation.setOnClickListener(view -> {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:39.5690693130226, 2.6526244268922614"));
            startActivity(i);
        });

        btnWebsite.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://hotelsantfrancesc.com/en");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        btnCall.setOnClickListener(view -> {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+34971495000"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });
    }

    //Switch Vector (Image) Asset
    public void goLeftVector(View view) {
        ImageView imageView = findViewById(R.id.imgMain);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.palmafour);
            imageView.setTag("4");
        } else if (resource.equalsIgnoreCase("4")) {
            imageView.setImageResource(R.drawable.palmathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.palmatwo);
            imageView.setTag("2");
        } else {
            imageView.setImageResource(R.drawable.palmaone);
            imageView.setTag("1");
        }
    }

    public void goRightVector(View view) {
        ImageView imageView = findViewById(R.id.imgMain);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.palmatwo);
            imageView.setTag("2");
        } else if (resource.equalsIgnoreCase("2")) {
            imageView.setImageResource(R.drawable.palmathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.palmafour);
            imageView.setTag("4");
        } else {
            imageView.setImageResource(R.drawable.palmaone);
            imageView.setTag("1");
        }
    }
}