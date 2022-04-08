package com.example.app3;

import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, DatePickerDialog.OnDateSetListener {
    private DrawerLayout drawer;
    private HoroscopeFragment hf = new HoroscopeFragment();

    //for find
    Button findButton;
    TextView signText;
    TextView signTextDesc;
    String toSet = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //prepareHoroscopeData();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FindFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_find);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_horoscope:
                //startActivity(new Intent(this, HoroscopeActivity.class));
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HoroscopeFragment()).commit();

                break;
            case R.id.nav_find:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FindFragment()).commit();
                break;
            case R.id.nav_signs:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SignsFragment()).commit();
                break;
            case R.id.nav_planets:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PlanetsFragment()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //TEST DELETE
    public void doThePoo(View view) {
        System.out.println("Poopin");
    }


    //------------Find methods
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        signText.setText(getSign(day, month));
        signTextDesc.setText(toSet);
    }

    private String getSign(int day, int month) {
        String sign = "";

        if (month == 0) {
            if (day < 20) {
                sign = "Capricorn";
                toSet = getResources().getString(R.string.capricorn_desc);
            } else {
                sign = "Aquarius";
                toSet = getResources().getString(R.string.aquarius_desc);
            }
        } else if (month == 1) {
            if (day < 20) {
                sign = "Aquarius";
                toSet = getResources().getString(R.string.aquarius_desc);
            } else {
                sign = "Pisces";
                toSet = getResources().getString(R.string.pisces_desc);
            }
        } else if (month == 2) {
            if (day < 20) {
                sign = "Pisces";
                toSet = getResources().getString(R.string.pisces_desc);
            } else {
                sign = "Aries";
                toSet = getResources().getString(R.string.aries_desc);
            }
        } else if (month == 3) {
            if (day < 20) {
                sign = "Aries";
                toSet = getResources().getString(R.string.aries_desc);
            } else {
                sign = "Taurus";
                toSet = getResources().getString(R.string.taurus_desc);
            }
        } else if (month == 4) {
            if (day < 20) {
                sign = "Taurus";
                toSet = getResources().getString(R.string.taurus_desc);
            } else {
                sign = "Gemini";
                toSet = getResources().getString(R.string.gemini_desc);
            }
        } else if (month == 5) {
            if (day < 20) {
                sign = "Gemini";
                toSet = getResources().getString(R.string.gemini_desc);
            } else {
                sign = "Cancer";
                toSet = getResources().getString(R.string.cancer_desc);
            }
        } else if (month == 6) {
            if (day < 20) {
                sign = "Cancer";
                toSet = getResources().getString(R.string.cancer_desc);
            } else {
                sign = "Leo";
                toSet = getResources().getString(R.string.leo_desc);
            }
        } else if (month == 7) {
            if (day < 20) {
                sign = "Leo";
                toSet = getResources().getString(R.string.leo_desc);
            } else {
                sign = "Virgo";
                toSet = getResources().getString(R.string.virgo_desc);
            }
        } else if (month == 8) {
            if (day < 20) {
                sign = "Virgo";
                toSet = getResources().getString(R.string.virgo_desc);
            } else {
                sign = "Libra";
                toSet = getResources().getString(R.string.libra_desc);
            }
        } else if (month == 9) {
            if (day < 20) {
                sign = "Libra";
                toSet = getResources().getString(R.string.libra_desc);
            } else {
                sign = "Scorpio";
                toSet = getResources().getString(R.string.scorpio_desc);
            }
        } else if (month == 10) {
            if (day < 20) {
                sign = "Scorpio";
                toSet = getResources().getString(R.string.scorpio_desc);
            } else {
                sign = "Sagittarius";
                toSet = getResources().getString(R.string.sagittarius_desc);
            }
        } else if (month == 11) {
            if (day < 20) {
                sign = "Sagittarius";
                toSet = getResources().getString(R.string.sagittarius_desc);
            } else {
                sign = "Capricorn";
                toSet = getResources().getString(R.string.capricorn_desc);
            }
        }
        return sign;
    }

    public void findButtMeth(View v) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        findButton = findViewById(R.id.findButton);
        signText = findViewById(R.id.signText);
        signTextDesc = findViewById(R.id.signTextDesc);
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                MainActivity.this, year, month, day);
        datePickerDialog.show();
    }



}

