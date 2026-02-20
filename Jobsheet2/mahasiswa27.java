package Jobsheet2;

public class mahasiswa27 {
    // Atribut
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Method to display student information
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    // Method to change class
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Method to update IPK
    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        }
    }

    // Method to evaluate performance
    String nilaiKinerja() {
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