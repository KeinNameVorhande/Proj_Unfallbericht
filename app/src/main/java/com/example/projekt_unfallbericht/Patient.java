package com.example.projekt_unfallbericht;

import com.example.*;


import java.sql.Date;
import java.sql.Time;

public class Patient {
    Time time;
    Date date;
    String ort, strasse;
    int plz, nr;
    boolean verletzt;
    boolean sachschaeden;

    public Patient(Time time, Date date, String ort, String strasse, int plz, int nr, boolean verletzt, boolean sachschaeden) {
        this.time = time;
        this.date = date;
        this.ort = ort;
        this.strasse = strasse;
        this.plz = plz;
        this.nr = nr;
        this.verletzt = verletzt;
        this.sachschaeden = sachschaeden;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("time=").append(time);
        sb.append(", date=").append(date);
        sb.append(", ort='").append(ort).append('\'');
        sb.append(", strasse='").append(strasse).append('\'');
        sb.append(", plz=").append(plz);
        sb.append(", nr=").append(nr);
        sb.append(", verletzt=").append(verletzt);
        sb.append(", sachschaeden=").append(sachschaeden);
        sb.append('}');
        return sb.toString();
    }
}