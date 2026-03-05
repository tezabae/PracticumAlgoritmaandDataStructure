package Jobsheet3;

import Jobsheet3.Mahasiswa26;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa26[] arrayMahasiswa = new Mahasiswa26[3];
        arrayMahasiswa[0] = new Mahasiswa26();
        arrayMahasiswa[0].nim = "254107020198";
        arrayMahasiswa[0].name = "Tesalonika GB";
        arrayMahasiswa[0].classname = "TI-1I";
        arrayMahasiswa[0].ipk = (Float)3.8f;

        arrayMahasiswa[1] = new Mahasiswa26();
        arrayMahasiswa[1].nim = "254107020199";
        arrayMahasiswa[1].name = "Zhao Yufan";
        arrayMahasiswa[1].classname = "TI-1I";
        arrayMahasiswa[1].ipk = (Float)3.9f;

        arrayMahasiswa[2] = new Mahasiswa26();
        arrayMahasiswa[2].nim = "254107020200";
        arrayMahasiswa[2].name = "Edwards Martin";
        arrayMahasiswa[2].classname = "TI-1I";
        arrayMahasiswa[2].ipk = (Float)3.7f;

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("NIM : " + arrayMahasiswa[i].nim);
            System.out.println("Name : " + arrayMahasiswa[i].name);
            System.out.println("Class : " + arrayMahasiswa[i].classname);
            System.out.println("IPK : " + arrayMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
        

    }
    
}
