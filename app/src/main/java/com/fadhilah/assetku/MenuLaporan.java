package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuLaporan extends AppCompatActivity {

    private Button button_maps,button_datasemua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_laporan);

        button_maps = (Button) findViewById(R.id.button_maps);
        button_datasemua = (Button) findViewById(R.id.button_datasemua);

        button_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaps();
            }
        });
        button_datasemua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDataSemua();
            }
        });
    }

    public void openMaps(){
        Intent intent = new Intent(this,Maps.class);
        startActivity(intent);
    }
    public void openDataSemua(){
        Intent intent = new Intent(this,MenuLaporanData.class);
        startActivity(intent);
    }
}