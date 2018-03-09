package com.binar.basic2;

/**
 * Keyword 'extends' menandakan bahwa
 * kelas 'Car' adalah turunan dari 'Vehicle'
 */
public class Car extends Vehicle {

    private int roda;
    private int mesin;

    public Car(int speed, String nama, int jumlahRoda, int jumlahMesin) {

        /**
         * keyword 'super' dipakai oleh 'subclass' untuk mengakses method dari 'superclass' nya
         * pemanggilannya HARUS berada paling atas dari blok kode method
         * disini kita mengakses konstruktor Vehicle dengan 2 parameter
         */
        super(speed, nama);

        this.roda = jumlahRoda;
        this.mesin = jumlahMesin;
    }

    /**
     * GETTER dan SETTER
     * @return
     */
    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getMesin() {
        return mesin;
    }

    @Override
    public int getSpeed() {
        int speedLocal = 100000;
        return speedLocal;
    }

    public void setMesin(int mesin) {
        this.mesin = mesin;
    }
}

