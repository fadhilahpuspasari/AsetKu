package com.example.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.assetku.data.LoginRepository;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    private LoginRepository loginRepository;
    private Intent destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        loginRepository = new LoginRepository();
        boolean isLoggedIn = loginRepository.isLoggedIn(SplashScreen.this);

        if (isLoggedIn){
            destination = new Intent(this,MainActivity.class);
        }else {
            destination = new Intent(this, LoginActivity.class);
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent loginIntent = new Intent (SplashScreen.this, LoginActivity.class);
                startActivity(destination);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}