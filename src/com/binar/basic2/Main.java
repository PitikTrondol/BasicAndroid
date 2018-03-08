package com.binar.basic2;

public class Main {

    private static Vehicle kendaraan;
    private static Vehicle testOverloading;
    private static Car mobil;

    public static void main(String[] args) {

        /** inisialisasi
         * me-realisasikan object dari kelas yang telah di deklarasi
         */
        kendaraan = new Vehicle(1000, "Kendaraan");
        kendaraan.setSpeed(1500);

        testOverloading = new Vehicle();

        mobil = new Car(10000, "Sedan", 4, 1);

        /**
         * Object Vehicle mengakses method dari kelas Vehicle
         */
        System.out.println("Object kendaraan");
        System.out.println("Speed : "+kendaraan.getSpeed());
        System.out.println("Nama : "+kendaraan.getNama());

        /**
         * Object Vehicle mengakses variabel dari Kelas Vehicle
         */
        System.out.println("variabel public : "+kendaraan.speed2);
        System.out.println("variabel protected : "+kendaraan.speed3);
        System.out.println("\n"); // jeda

        /**
         *  'testOverloading'
         *  akan membuat object Vehicle dengan variabel bernilai default
         *  karena konstruktor 'Vehicle()' tidak melakukan perubahan atribut (variabel)
         */
        System.out.println("Test Overloading");
        System.out.println("Speed : "+testOverloading.getSpeed()); //default type data int adalah 0
        System.out.println("Nama : "+testOverloading.getNama()); //default type data String adalah null
        System.out.println("\n"); // jeda

        /**
         *  Inheritance
         *  subclass = Car
         *  superclass = Vehicle
         *  Object subclass mengakses method superclass
         */
        System.out.println("Object mobil");
        System.out.println("method turunan dari vehicle");
        System.out.println("Speed Mobil : "+mobil.getSpeed());
        System.out.println("Nama Mobil : "+mobil.getNama());

        /**
         * object subclass mengakses variabel superclass
         */
        System.out.println("variabel turunan dari vehicle");
        System.out.println("Variabel public "+mobil.speed2);
        System.out.println("Variabel protected "+mobil.speed3);

        /**
         * object 'Car' mengakses method dari kelasnya sendiri
         */
        System.out.println("method dari kelas 'Car'");
        System.out.println("Jumlah Roda "+mobil.getRoda());
        System.out.println("Jenis Mesin "+mobil.getMesin());
        System.out.println("\n"); // jeda
    }
}
