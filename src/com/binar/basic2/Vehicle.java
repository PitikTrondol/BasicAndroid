package com.binar.basic2;

// nama kelas untuk pengalamatan
public class Vehicle {

    // variabel
    private int speed;
    private String nama;
    public int speed2;
    protected int speed3;

    // konstruktor method dengan nama sama dengan kelas, tanpa kembalian
    public Vehicle(int speed, String nama) {
        this.speed = speed;
        this.nama = nama;
    }

    // overloading
    // Konstruktor tanpa parameter
    public Vehicle() {

    }

    // getter :: method yang mengembalikan nilai dari variable
    public int getSpeed() {
        return speed;
    }

    public String getNama() {
        return nama;
    }

    // method yang mengembalikan nilai hasil perhitungan lokal
    public String getNama2() {
        return "Nama Dua";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // setter :: method yang digunakan untuk mengubah nilai variabel
    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
