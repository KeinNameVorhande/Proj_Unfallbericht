package com.example.projekt_unfallbericht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int counter;

        try {
            FileInputStream fis = openFileInput("count.txt");
            BufferedReader br = new BufferedReader()
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public void onButtonCLick(View view){
        Intent intent = new Intent(this, newActivity.class);
        startActivity(intent);

        Bundle bundle = intent.getExtras();

    }
}