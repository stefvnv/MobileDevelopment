package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OtherActivity extends AppCompatActivity {

    //private ImageView androidIcon;

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
            ImageView imageView = findViewById(R.id.imgTenerife);
            String resource = (String) imageView.getTag();

            @Override
            public void onClick(View view) {
                if (resource.equalsIgnoreCase("1")) {
                    imageView.setVisibility(View.GONE);
                    imageView.setTag("2");
                } else if (resource.equalsIgnoreCase("2")) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setTag("1");
                }
            }
        });
    }

    //Visibility
    /**
     public void goHide(View v) {
     androidIcon = findViewById(R.id.imgTenerife);
     androidIcon.setVisibility(View.GONE);
     //  androidIcon.setVisibility(View.INVISIBLE);
     }

     public void goShow(View v) {
     androidIcon = findViewById(R.id.imgTenerife);
     androidIcon.setVisibility(View.VISIBLE);
     }
     **/

}