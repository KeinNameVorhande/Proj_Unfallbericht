package com.example.projekt_unfallbericht;

import com.example.*;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Patient implements Serializable {


    String ort, strasse;
    int plz, nr;
    int hour, minute;
    int day, month, year;
    boolean verletzt;
    boolean sachschaeden;
    ArrayList<Person> zeugen;

    public Patient(String ort, String strasse, int plz, int nr, int hour, int minute, int day, int month, int year, boolean verletzt, boolean sachschaeden, ArrayList<Person> zeugen) {
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
        this.zeugen = zeugen;
    }


    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isVerletzt() {
        return verletzt;
    }

    public void setVerletzt(boolean verletzt) {
        this.verletzt = verletzt;
    }

    public boolean isSachschaeden() {
        return sachschaeden;
    }

    public void setSachschaeden(boolean sachschaeden) {
        this.sachschaeden = sachschaeden;
    }



    @Override
    public String toString() {
        return ort+"\n"+day+":"+month+":"+year;

    }
}