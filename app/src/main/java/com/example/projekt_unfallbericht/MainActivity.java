package com.example.projekt_unfallbericht;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner scCounter;
    int counter;
    ArrayList<Patient> al;
    ListView lv;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al = new ArrayList<>();
        lv = findViewById(R.id.listView);

        //Permission request
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                23);

        //getCount();
        try {
            getPatients();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        bindAdapter(lv);
    }


    public void onButtonCLick(View view){
        Intent intent = new Intent(this, newActivity.class);
        startActivity(intent);

        Bundle bundle = intent.getExtras();
    }


    public void getPatients() throws IOException, ClassNotFoundException {

        String[] files = fileList();
        for(String temp : files){
            if(!temp.equals("count.txt")) {
                ObjectInputStream ois = new ObjectInputStream(openFileInput(temp));
                Patient p = (Patient) ois.readObject();
                al.add(p);
            }
        }

    }

    public void getCount(){
        try {
            scCounter = new Scanner(openFileInput("count.txt"));
            if(scCounter.hasNext()) {
                counter = scCounter.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bindAdapter(ListView lv){
        adapter = new MyAdapter(this, al, R.layout.my_layout);
        lv.setAdapter(adapter);
    }

}