package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[3];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {

            arrayOfMataKuliah[i] = new MataKuliah26();

            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));

            System.out.print("Kode       : ");
            kode = sc.nextLine();

            System.out.print("Nama       : ");
            nama = sc.nextLine();

            System.out.print("SKS        : ");
            sks = sc.nextInt();

            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt();
            sc.nextLine(); // membersihkan enter

            // memanggil method addData()
            arrayOfMataKuliah[i].addData(kode, nama, sks, jumlahJam);

            System.out.println("-----------------------------");
        }

        // menampilkan data
        System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah[i].printInfo();
        }
    }
}