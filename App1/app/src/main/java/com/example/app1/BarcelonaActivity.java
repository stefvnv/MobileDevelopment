package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BarcelonaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);

        //Java Button Clicks
        Button btnBarcelonaLocation = findViewById(R.id.btnBarcelonaLocation);
        Button btnBarcelonaWebsite = findViewById(R.id.btnBarcelonaWebsite);
        Button btnBarcelonaCall = findViewById(R.id.btnBarcelonaCall);


        //Intents
        btnBarcelonaLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:41.390694412075405, 2.169346519721641"));
                startActivity(i);
            }
        });

        btnBarcelonaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.almanachotels.com/barcelona");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnBarcelonaCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "+34930187000"));
                if (i.resolveActivity(getPackageManager()) != null)
                    startActivity(i);
            }
        });
    }

    //Switch Vector (Image) Asset
    public void goLeftVector(View view) {
        ImageView imageView = findViewById(R.id.imageBarcelona);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.barcelonafour);
            imageView.setTag("4");
        } else if (resource.equalsIgnoreCase("4")) {
            imageView.setImageResource(R.drawable.barcelonathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.barcelonatwo);
            imageView.setTag("2");
        } else {
            imageView.setImageResource(R.drawable.barcelonaone);
            imageView.setTag("1");
        }
    }

    public void goRightVector(View view) {
        ImageView imageView = findViewById(R.id.imageBarcelona);
        String resource = (String) imageView.getTag();

        if (resource.equalsIgnoreCase("1")) {
            imageView.setImageResource(R.drawable.barcelonatwo);
            imageView.setTag("2");
        } else if (resource.equalsIgnoreCase("2")) {
            imageView.setImageResource(R.drawable.barcelonathree);
            imageView.setTag("3");
        } else if (resource.equalsIgnoreCase("3")) {
            imageView.setImageResource(R.drawable.barcelonafour);
            imageView.setTag("4");
        } else {
            imageView.setImageResource(R.drawable.barcelonaone);
            imageView.setTag("1");
        }
    }
}