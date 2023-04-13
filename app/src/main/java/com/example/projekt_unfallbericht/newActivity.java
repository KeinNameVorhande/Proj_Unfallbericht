package com.example.projekt_unfallbericht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

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

        TextView tvOrt = findViewById(R.id.textOrt);
        DatePicker dp = findViewById(R.id.datePicker);
        TimePicker tp = findViewById(R.id.timePicker);
        TextView tvPLZ = findViewById(R.id.textPLZ);
        TextView tvStrasse = findViewById(R.id.textStraße);
        TextView tvNr = findViewById(R.id.textNr);







    }
}