package com.example.app3;

import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

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

        if (savedInstanceState == null) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
            //new HoroscopeFragment()).commit();
            startActivity(new Intent(this, HoroscopeActivity.class));

            navigationView.setCheckedItem(R.id.nav_horoscope);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_horoscope:
                startActivity(new Intent(this, HoroscopeActivity.class));
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                //new HoroscopeFragment()).commit();
                break;
            case R.id.nav_signs:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SignsFragment()).commit();
                break;
            case R.id.nav_planets:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PlanetsFragment()).commit();
                break;
            case R.id.nav_find:
                startActivity(new Intent(this, FindActivity.class));
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
}
