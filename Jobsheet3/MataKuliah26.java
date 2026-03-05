package Jobsheet3;

public class MataKuliah26 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    // constructor kosong
    public MataKuliah26() {

    }

    // constructor dengan parameter
    public MataKuliah26(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // method addData
    public void addData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // method printInfo
    public void printInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-----------------------------");
    }
}