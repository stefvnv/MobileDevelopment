package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GranadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granada);

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
                i.setData(Uri.parse("geo:37.17439607725324, -3.596692815489626"));
                startActivity(i);
            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.hotelgaranat.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "+34958225528"));
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
            imageView.setImageResource(R.drawable.granadafour);
            imageView.setTag("4");
        } else if (resource.equalsIgnoreCase("4")) {
            imageView.setImageResource(R.drawable.granadathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.granadatwo);
            imageView.setTag("2");
        } else {
            imageView.setImageResource(R.drawable.granadaone);
            imageView.setTag("1");
        }
    }

    public void goRightVector(View view) {
        ImageView imageView = findViewById(R.id.imgMain);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.granadatwo);
            imageView.setTag("2");
        } else if (resource.equalsIgnoreCase("2")) {
            imageView.setImageResource(R.drawable.granadathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.granadafour);
            imageView.setTag("4");
        } else {
            imageView.setImageResource(R.drawable.granadaone);
            imageView.setTag("1");
        }
    }
}