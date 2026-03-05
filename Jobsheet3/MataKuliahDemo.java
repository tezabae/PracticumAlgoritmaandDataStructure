package Jobsheet3;
import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode       :");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah[i] = new MataKuliah26(kode, nama, sks, jumlahJam);
        }
    }
}
