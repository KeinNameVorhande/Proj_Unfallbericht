package com.example.projekt_unfallbericht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class newActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
       setContentView(R.layout.activity_new);
        Intent intent = getIntent();



    }


    public void btnSave(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);

        EditText tvOrt = findViewById(R.id.textOrt);
        DatePicker dp = findViewById(R.id.datePicker);
        TimePicker tp = findViewById(R.id.timePicker);
        EditText tvPLZ = findViewById(R.id.textPLZ);
        EditText tvStrasse = findViewById(R.id.textStraße);
        EditText tvNr = findViewById(R.id.textNr);

        String ort = String.valueOf(tvOrt.getText());
        int plz = Integer.parseInt(String.valueOf(tvPLZ.getText()));
        String strasse = String.valueOf(tvStrasse.getText());
        int nr = Integer.parseInt(String.valueOf(tvNr.getText()));

        int day = dp.getDayOfMonth();
        int month = dp.getMonth();
        int year = dp.getYear();

        int hour = tp.getHour();
        int minute=  tp.getMinute();



    }
}