package com.binar.basic2;

// Buat kelas Car turunan dari Vehicle
public class Car extends Vehicle {

    private int roda;
    private int mesin;

    public Car(int speed, String nama, int jumlahRoda, int jumlahMesin) {
        
        super(speed, nama);
        this.roda = jumlahRoda;
        this.mesin = jumlahMesin;
    }
}

