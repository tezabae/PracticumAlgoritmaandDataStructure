package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of courses: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[jumlahMK];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMK; i++) {

            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));

            System.out.print("Kode       : ");
            kode = sc.nextLine();

            System.out.print("Nama       : ");
            nama = sc.nextLine();

            System.out.print("SKS        : ");
            sks = sc.nextInt();

            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMataKuliah[i] = new MataKuliah26();
            arrayOfMataKuliah[i].addData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i].printInfo();
        }
    }
}