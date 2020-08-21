package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPengukuran extends AppCompatActivity {

    private Button button_trafo1,button_trafo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pengukuran);

        button_trafo1 = (Button) findViewById(R.id.button_trafo1);
        button_trafo3 = (Button) findViewById(R.id.button_trafo3);

        button_trafo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrafo1();
            }
        });
        button_trafo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrafo3();
            }
        });

    }

    public void openTrafo1(){
        Intent intent = new Intent(this,MenuPengukuranTrafo1.class);
        startActivity(intent);
    }
    public void openTrafo3(){
        Intent intent = new Intent(this,MenuPengukuranTrafo3.class);
        startActivity(intent);
    }
}