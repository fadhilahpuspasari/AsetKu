package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.InputMismatchException;

public class UpdateData extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnDatePicker, btnTimePicker;
    EditText txtDate, txtTime, section, notiang, notiangFCO, nomorseri, pelaksana, tahunpembuatan, latitude, longitude;
    Button button_submit;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        btnDatePicker = (ImageButton) findViewById(R.id.btnDatePicker);
        btnTimePicker = (ImageButton) findViewById(R.id.btnTimePicker);
        txtDate = (EditText) findViewById(R.id.txtDate);
        txtTime = (EditText) findViewById(R.id.txtTime);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

        final EditText Input = findViewById(R.id.section);
        final EditText Input2 = findViewById(R.id.notiang);
        final EditText Input3 = findViewById(R.id.notiangFCO);
        final EditText Input4 = findViewById(R.id.nomorseri);
        final EditText Input5 = findViewById(R.id.pelaksana);
        final EditText Input6 = findViewById(R.id.tahunpembuatan);
        final EditText Input7 = findViewById(R.id.latitude);
        final EditText Input8 = findViewById(R.id.longitude);

        Button Submit = findViewById(R.id.button_submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = Input.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
            if (v.getId() == R.id.btnDatePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }


    }



    
}
