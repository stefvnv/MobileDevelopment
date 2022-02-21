package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //Java Button
        Button btnTenerife = findViewById(R.id.btnTenerife);
        Button btnAlicante = findViewById(R.id.btnAlicante);
        Button btnSebastian = findViewById(R.id.btnSebastian);
        Button btnCordoba = findViewById(R.id.btnCordoba);
        Button btnImgTenerife = findViewById(R.id.btnImgTenerife);
        Button btnImgAlicante = findViewById(R.id.btnImgAlicante);
        Button btnImgSebastian = findViewById(R.id.btnImgSebastian);
        Button btnImgCordoba = findViewById(R.id.btnImgCordoba);


        //Videos
        btnTenerife.setOnClickListener(view -> {
            Intent i = new Intent(OtherActivity.this, TenerifeActivity.class);
            startActivity(i);
        });

        btnAlicante.setOnClickListener(view -> {
            Intent i = new Intent(OtherActivity.this, AlicanteActivity.class);
            startActivity(i);
        });

        btnSebastian.setOnClickListener(view -> {
            Intent i = new Intent(OtherActivity.this, SebastianActivity.class);
            startActivity(i);
        });

        btnCordoba.setOnClickListener(view -> {
            Intent i = new Intent(OtherActivity.this, CordobaActivity.class);
            startActivity(i);
        });


        //Visibility
        btnImgTenerife.setOnClickListener(new View.OnClickListener() {
            final ImageView imageView = findViewById(R.id.imgTenerife);

            @Override
            public void onClick(View view) {

                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.GONE);
                } else if (imageView.getVisibility() == View.GONE) {
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

        btnImgAlicante.setOnClickListener(new View.OnClickListener() {
            final ImageView imageView = findViewById(R.id.imgAlicante);

            @Override
            public void onClick(View view) {

                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.GONE);
                } else if (imageView.getVisibility() == View.GONE) {
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

        btnImgSebastian.setOnClickListener(new View.OnClickListener() {
            final ImageView imageView = findViewById(R.id.imgSebastian);

            @Override
            public void onClick(View view) {

                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.GONE);
                } else if (imageView.getVisibility() == View.GONE) {
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

        btnImgCordoba.setOnClickListener(new View.OnClickListener() {
            final ImageView imageView = findViewById(R.id.imgCordoba);

            @Override
            public void onClick(View view) {

                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.GONE);
                } else if (imageView.getVisibility() == View.GONE) {
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}