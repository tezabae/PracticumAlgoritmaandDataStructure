package Jobsheet3;
import java.util.Scanner;

public class dosenDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        dosen26[] arrayOfDosen = new dosen26[n];

        // FOR loop untuk membuat array objek
        for (int i = 0; i < n; i++) {

            System.out.println("\nInput Lecturer Data " + (i + 1));

            System.out.print("Code   : ");
            String code = sc.nextLine();

            System.out.print("Name   : ");
            String name = sc.nextLine();

            System.out.print("Gender (true = Male / false = Female): ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age    : ");
            int age = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new dosen26(code, name, gender, age);
        }

        System.out.println("\nLecturer Data");

        // FOREACH untuk menampilkan data
        for (dosen26 dsn : arrayOfDosen) {
            dsn.displayInfo();
        }
    }
}