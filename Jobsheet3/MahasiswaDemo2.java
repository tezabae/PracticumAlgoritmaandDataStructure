package Jobsheet3;
import java.util.Scanner;
import Jobsheet3.Mahasiswa26;

public class MahasiswaDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa26[] arrayMahasiswa = new Mahasiswa26[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayMahasiswa[i] = new Mahasiswa26();

            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1) + " : ");
            System.out.print("NIM : ");
            arrayMahasiswa[i].nim = input.nextLine();
            System.out.print("Name : ");
            arrayMahasiswa[i].name = input.nextLine();
            System.out.print("Class : ");
            arrayMahasiswa[i].classname = input.nextLine();
            System.out.print("IPK : ");
            arrayMahasiswa[i].ipk = input.nextFloat();
            dummy = input.nextLine();
        }


        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("NIM : " + arrayMahasiswa[i].nim);
            System.out.println("Name : " + arrayMahasiswa[i].name);
            System.out.println("Class : " + arrayMahasiswa[i].classname);
            System.out.println("IPK : " + arrayMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
        

    }
    
}
