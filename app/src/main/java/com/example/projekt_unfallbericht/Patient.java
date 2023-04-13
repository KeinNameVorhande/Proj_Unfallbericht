package com.example.projekt_unfallbericht;

import com.example.*;


import java.sql.Date;
import java.sql.Time;

public class Patient {


    String ort, strasse;
    int plz, nr;
    int hour, minute;
    int day, month, year;
    boolean verletzt;
    boolean sachschaeden;

    public Patient(String ort, String strasse, int plz, int nr, int hour, int minute, int day, int month, int year, boolean verletzt, boolean sachschaeden) {
        this.ort = ort;
        this.strasse = strasse;
        this.plz = plz;
        this.nr = nr;
        this.hour = hour;
        this.minute = minute;
        this.day = day;
        this.month = month;
        this.year = year;
        this.verletzt = verletzt;
        this.sachschaeden = sachschaeden;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ort='" + ort + '\'' +
                ", strasse='" + strasse + '\'' +
                ", plz=" + plz +
                ", nr=" + nr +
                ", hour=" + hour +
                ", minute=" + minute +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", verletzt=" + verletzt +
                ", sachschaeden=" + sachschaeden +
                '}';
    }
}