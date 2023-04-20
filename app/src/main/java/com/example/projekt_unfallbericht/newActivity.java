package com.example.projekt_unfallbericht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class newActivity extends AppCompatActivity {


    EditText tvOrt;
    DatePicker dp;
    TimePicker tp;
    EditText tvPLZ;
    EditText tvStrasse;
    EditText tvNr;
    CheckBox cbVerletzt;
    CheckBox cbSachschäden;

    Intent intent;
    Bundle b;
    boolean change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        setContentView(R.layout.activity_new);

        change = false;

        tvOrt = findViewById(R.id.textOrt);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        tvPLZ = findViewById(R.id.textPLZ);
        tvStrasse = findViewById(R.id.textStraße);
        tvNr = findViewById(R.id.textNr);
        cbVerletzt = findViewById(R.id.checkBoxVerletzte);
        cbSachschäden = findViewById(R.id.checkBoxSachschäden);


        intent = getIntent();
        b = intent.getExtras();
        if(b != null) {
            Patient p;
            if (b.containsKey("filename")) {
                change = true;
                try {
                    ObjectInputStream ois = new ObjectInputStream(openFileInput(b.getString("filename")));
                    p = (Patient) ois.readObject();
                    tvOrt.setText(p.getOrt());
                    dp.updateDate(p.year,p.month,p.day);
                    tp.setHour(p.hour);
                    tp.setMinute(p.minute);
                    tvPLZ.setText(String.valueOf(p.plz));
                    tvStrasse.setText(p.strasse);
                    tvNr.setText(String.valueOf(p.nr));
                    cbSachschäden.setChecked(p.sachschaeden);
                    cbVerletzt.setChecked(p.verletzt);
                    System.out.println("test");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }


    public void btnSave(View view) throws IOException {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);

        String ort = String.valueOf(tvOrt.getText());
        int plz = Integer.parseInt(String.valueOf(tvPLZ.getText()));
        String strasse = String.valueOf(tvStrasse.getText());
        int nr = Integer.parseInt(String.valueOf(tvNr.getText()));

        //DatePicker
        int day = dp.getDayOfMonth();
        int month = dp.getMonth();
        int year = dp.getYear();

        //TimePicker
        int hour = tp.getHour();
        int minute = tp.getMinute();

        boolean verletzt = cbVerletzt.isChecked();
        boolean sachschäden = cbSachschäden.isChecked();

        b = intent.getExtras();

        if(change){
            ObjectOutputStream oos = new ObjectOutputStream(openFileOutput(b.getString("filename") , MODE_PRIVATE));
            oos.writeObject(new Patient(ort, strasse, plz, nr, hour, minute, day, month, year, verletzt, sachschäden, new LinkedList<Person>()));
            oos.close();
            b.remove("filename");
            change = false;
        }
        else {


            if (ort.equals("") || String.valueOf(plz).equals("") || strasse.equals("") || String.valueOf(nr).equals("")) {
                Toast.makeText(this, "Something is empty", Toast.LENGTH_SHORT).show();
            } else {

                int currentCount;
                Patient p = new Patient(ort, strasse, plz, nr, hour, minute, day, month, year, verletzt, sachschäden, new LinkedList<Person>());
                try {
                    Scanner sc = new Scanner(openFileInput("count.txt"));
                    currentCount = sc.nextInt();
                    sc.close();
                } catch (Exception e) {
                    currentCount = 0;
                }
                PrintWriter pr = new PrintWriter((OutputStream) openFileOutput("count.txt", MODE_PRIVATE));
                currentCount++;
                pr.write(currentCount + "");
                pr.close();


                ObjectOutputStream oos = new ObjectOutputStream(openFileOutput("bericht" + currentCount + ".txt", MODE_PRIVATE));
                oos.writeObject(p);
                oos.close();
                System.out.println("test");


                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                System.out.println("test");
            }
        }




    }







    public void btnZurueck(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}