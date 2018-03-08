package com.binar.basic2;

public class Main {

    private static Vehicle kendaraan;
    private static Car mobil;
    private static String nama3 = "Sedan";

    public static void main(String[] args) {

//        inisialisasi
        kendaraan = new Vehicle(1000, "Kendaraan");
        kendaraan.setSpeed(1500);

        mobil = new Car(10000, "Sedan", 4, 1);

        // Mengakses method dari kelas Vehicle
        System.out.println("Speed : "+kendaraan.getSpeed());
        System.out.println("Nama : "+kendaraan.getNama());

//        // mengakses variabel dari Kelas Vehicle
//        System.out.println("Nama : "+kendaraan.speed2);
//        System.out.println("Nama : "+kendaraan.speed3);

        //Kelas mobil
        System.out.println("Speed Mobil : "+mobil.getSpeed());
        System.out.println("Nama Mobil : "+mobil.getNama());
    }
}
