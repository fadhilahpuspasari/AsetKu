package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuAset extends AppCompatActivity {

    private ImageButton button_data, button_pengukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_aset);

        button_data = (ImageButton) findViewById(R.id.button_data);
        button_pengukuran = (ImageButton) findViewById(R.id.button_pengukuran);

        button_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuData();
            }
        });
        button_pengukuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuPengukuran();
            }
        });
    }

    public void openMenuData(){
        Intent intent = new Intent(this, MenuData.class);
        startActivity(intent);
    }
    public void openMenuPengukuran(){
        Intent intent = new Intent(this, MenuPengukuran.class);
        startActivity(intent);
    }
}