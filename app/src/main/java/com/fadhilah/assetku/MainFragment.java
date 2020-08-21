package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        BottomNavigationView bottomNav;

        bottomNav = findViewById(R.id.bottom_navigation);

        bottomNav.setVisibility(View.VISIBLE);


    }
}