package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.spec.MGF1ParameterSpec;

public class MenuData extends AppCompatActivity {

    private Button button_data,button_maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_data);

        button_data = (Button) findViewById(R.id.button_data);
        button_maps = (Button) findViewById(R.id.button_maps);

        button_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuData();
            }
        });
        button_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuMaps();
            }
        });

    }

    public void openMenuData(){
        Intent intent = new Intent(this, UpdateData.class);
        startActivity(intent);
    }
    public void openMenuMaps(){
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
    }
}