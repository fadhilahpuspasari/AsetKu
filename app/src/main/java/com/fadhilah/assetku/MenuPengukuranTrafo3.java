package com.fadhilah.assetku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MenuPengukuranTrafo3 extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnDatePicker, btnTimePicker;
    EditText txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengukuran_trafo3);

        btnDatePicker=(ImageButton)findViewById(R.id.btnDatePicker);
        btnTimePicker=(ImageButton)findViewById(R.id.btnTimePicker);
        txtDate=(EditText)findViewById(R.id.txtDate);
        txtTime=(EditText)findViewById(R.id.txtTime);
        Button Submit = findViewById(R.id.button_submit);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

        final EditText Input = findViewById(R.id.txtDate);
        final EditText Input2 = findViewById(R.id.txtTime);
        final EditText Input3 = findViewById(R.id.petugas);
        final EditText Input4 = findViewById(R.id.notiang);
        final EditText Input5 = findViewById(R.id.r);
        final EditText Input6 = findViewById(R.id.s);
        final EditText Input7 = findViewById(R.id.t);
        final EditText Input8 = findViewById(R.id.n);
        final EditText Input9 = findViewById(R.id.teganganpangkal);
        final EditText Input10 = findViewById(R.id.teganganujung);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = Input.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Tanggal Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input2.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Waktu Harus Diisin", Toast.LENGTH_SHORT).show();
                }
                Text = Input3.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Petugas Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input4.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "No Tiang Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input5.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "R Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input6.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "S Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input7.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "T Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input8.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "N Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input9.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Tegangan Pangkal Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                Text = Input10.getText().toString();
                if (Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Tegangan Ujung Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                toast();
            }

        });


    }

    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

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
        if (v == btnTimePicker) {

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
    public void toast(){
        Context context=getApplicationContext();
        CharSequence text="Data Tersimpan";
        int durasi=Toast.LENGTH_LONG;

        Toast toast=Toast.makeText(context, text, durasi);
        toast.show();
    }
}