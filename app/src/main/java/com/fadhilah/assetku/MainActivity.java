package com.fadhilah.assetku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

//    BottomNavigationView bottomNavigationView;
    private ImageButton button_aset,button_laporan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setUpNavigation();

        button_aset = (ImageButton) findViewById(R.id.button_aset);
        button_laporan = (ImageButton) findViewById(R.id.button_laporan);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:
                        return true;

                    case R.id.navigation_setting:
                        startActivity(new Intent(getApplicationContext(),
                                FragmentSetting.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


        button_aset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuAset();
            }
        });
        button_laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuLaporan();
            }
        });

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                    new FragmentHome()).commit();
        }*/
    }

    public void openMenuAset(){
        Intent intent = new Intent(this, MenuAset.class);
        startActivity(intent);
    }

    public void openMenuLaporan(){
        Intent intent = new Intent(this, MenuLaporan.class);
        startActivity(intent);
    }

    /*public void setUpNavigation(){
        bottomNavigationView =findViewById(R.id.bottom_navigation);
        NavHostFragment navHostFragment =       (NavHostFragment)getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView,
                navHostFragment.getNavController());
    }*/

    /*private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            selectedFragment = new FragmentHome();
                            break;
                        case R.id.navigation_setting:
                            selectedFragment = new FragmentSetting();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                            selectedFragment).commit();
                    return true;
                }
            };*/
}