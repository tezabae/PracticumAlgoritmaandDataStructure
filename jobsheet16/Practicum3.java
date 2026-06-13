package jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Mahasiswa {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}

class ListMahasiswa {
    ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

    // Varargs add
    public void tambah(Mahasiswa... mhs) {
        mahasiswas.addAll(Arrays.asList(mhs));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(System.out::println);
    }

    // Binary search by NIM
    public int binarySearch(String nim) {
        mahasiswas.sort((a, b) -> a.nim.compareTo(b.nim));
        return Collections.binarySearch(
            mahasiswas,
            new Mahasiswa(nim, "", ""),
            (a, b) -> a.nim.compareTo(b.nim)
        );
    }

    // Sorting functions
    public void sortByNimAscending() {
        mahasiswas.sort((a, b) -> a.nim.compareTo(b.nim));
    }

    public void sortByNimDescending() {
        mahasiswas.sort((a, b) -> b.nim.compareTo(a.nim));
    }

    public void sortByNameAscending() {
        mahasiswas.sort((a, b) -> a.nama.compareTo(b.nama));
    }

    public void sortByNameDescending() {
        mahasiswas.sort((a, b) -> b.nama.compareTo(a.nama));
    }
}

public class Practicum3 {
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m1 = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m2 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m3 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m1, m2, m3);

        System.out.println("Initial list:");
        lm.tampil();

        // Binary search
        int index = lm.binarySearch("201235");
        if (index >= 0) {
            lm.update(index, new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        }

        System.out.println("\nAfter update:");
        lm.tampil();

        // Sorting demo
        lm.sortByNameAscending();
        System.out.println("\nSorted by name ascending:");
        lm.tampil();

        lm.sortByNimDescending();
        System.out.println("\nSorted by NIM descending:");
        lm.tampil();
    }
}
