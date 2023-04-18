package com.example.projekt_unfallbericht;

import java.io.Serializable;

public class Person implements Serializable {
    String vn,nm,strasse,ort;
    int telnr;

    public Person(String vn, String nm, String strasse, String ort, int telnr) {
        this.vn = vn;
        this.nm = nm;
        this.strasse = strasse;
        this.ort = ort;
        this.telnr = telnr;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getTelnr() {
        return telnr;
    }

    public void setTelnr(int telnr) {
        this.telnr = telnr;
    }

    @Override
    public String toString() {
        return vn+" "+nm;
    }
}
