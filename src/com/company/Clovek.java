package com.company;

public class Clovek {
    private int vek;
    private String jmeno;
    private String prijmeni;
    private String bydliste;

    public Clovek(String jmeno, String prijmeni, int vek, String bydliste){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.bydliste = bydliste;
    }

    public int getVek() {
        return vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }

    public String toString(){
        return (jmeno + " " + prijmeni + ", věk: " + vek + ", bydliště: " + bydliste);
    }
}