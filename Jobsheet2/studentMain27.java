package Jobsheet2;
import java.util.Scanner;

public class studentMain27 {
    public static void main(String[] args) {
        mahasiswa27 mhs1 = new mahasiswa27();
        mhs1.nama = "Tezaa";
        mhs1.nim = "254107020198";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.8;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1I");
        mhs1.updateIPK(3.9);
        mhs1.tampilkanInformasi();

    }
}
