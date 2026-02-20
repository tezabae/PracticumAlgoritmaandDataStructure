import java.util.Scanner;

public class mahasiswa27 {
    String nama;
    String nim;
    String kelas;
    double ipk;

void tampilkanInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Kelas: " + kelas);
    System.out.println("IPK: " + ipk);
}
void ubahKelas(String kelasBaru) {
    kelas = kelasBaru;
}
void updateIPK(double ipkBaru) {
    ipk = ipkBaru;
}
String nilaiKinerja () {
    if (ipk >= 3.5) {
        return "Kinerja sangat baik";
    } else if (ipk >= 3.0) {
        return "kinerja Baik";
    } else if (ipk >= 2.5) {
        return "Kinerja Cukup";
    } else {
        return "Kinerja Kurang";
    }
}
}