package com.example.projekt_unfallbericht;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            BufferedReader br = new BufferedReader(new FileReader("count.txt"));
            int counter = Integer.parseInt(br.readLine());
            br.close();
            FileWriter fw = new FileWriter("count.txt");
            fw.write(""+counter++);
            fw.close();
        }catch (Exception e){
            Log.d("TAG", "Fehler");
        }


    }
    public void onButtonCLick(View view){
        Intent intent = new Intent(this, newActivity.class);
        startActivity(intent);

        Bundle bundle = intent.getExtras();

    }
}