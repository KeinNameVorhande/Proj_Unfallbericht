package com.example.projekt_unfallbericht;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner scCounter;
    int counter;
    ArrayList<Patient> al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                23);
        try {
            scCounter = new Scanner(openFileInput("count.txt"));
            if(scCounter.hasNext()) {
                counter = scCounter.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void onButtonCLick(View view){
        Intent intent = new Intent(this, newActivity.class);
        startActivity(intent);

        Bundle bundle = intent.getExtras();

    }

    private void fillListView(){
        //Reischl des muast daun du moch
    }
}