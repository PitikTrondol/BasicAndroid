package com.binar.basic2;

public class Vehicle {

    /**
     *  ==================== Variabel ====================
     * public = bisa diakses 'BEBAS' dari luar kelas
     * protected = bisa diakses 'TERBATAS' dari
     *              - kelas itu sendiri,
     *              - object dari kelas,
     *              - subclass
     *              - dan object dari subclass
     * private = bisa diakses 'HANYA' dari dalam kelas itu sendiri
     */
    private int speed;
    private String nama;

    public int speed2;
    protected int speed3;

    /**
     * ===================== Konstruktor =====================
     * method dengan nama sama dengan kelas, tanpa return type
     * digunakan ketika inisialisasi object
     * @param speed
     * @param nama
     */
    public Vehicle(int speed, String nama) {
        this.speed = speed;
        this.nama = nama;
    }

    /**
     * ===================== Overloading ====================
     * Membuat method dengan nama sama tapi parameter berbeda
     */
    public Vehicle() {

    }

    /**
     * ==================== Getter =====================
     * method yang mengembalikan nilai, berupa type data primitive maupun object
     * dari variabel yang dideklarasikan diatas
     * method 'getSpeed' mengembalikan tipe data 'int' dari variabel 'speed'
     * method 'getNama' mengembalikan tipe data 'String' dari variabel 'nama'
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    public String getNama() {
        return nama;
    }

    /**
     * method getName2 BUKAN merupakan bagian dari getter,
     * karena mengembalikan hasil dari operasi (inisialisasi, perhitungan, pengurangan, dst) lokal
     * @return
     */
    public String getNama2() {
        return "Nama Dua";
    }

    /**
     * ===================== Setter ======================
     * method yang digunakan untuk mengubah nilai dari variabel (atribut) kelas
     * keyword 'this' merujuk pada kelas dimana 'this' dipanggil
     * pemanggilan 'this.nama' berarti merujuk pada variabel 'nama' yang dimiliki kelas ini (Vehicle)
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
