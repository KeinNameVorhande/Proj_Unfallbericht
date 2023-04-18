package com.example.projekt_unfallbericht;

public class Person {
    String vn,nm;

    public Person(String vn, String nm) {
        this.vn = vn;
        this.nm = nm;
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

    @Override
    public String toString() {
        return vn+" "+nm;
    }
}
