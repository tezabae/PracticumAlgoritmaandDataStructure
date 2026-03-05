package Jobsheet3;
import java.util.Scanner;

public class DosenDemo26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen26[] arrayOfDosen = new Dosen26[n];

        // Input lecturer data
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

            arrayOfDosen[i] = new Dosen26(code, name, gender, age);
        }

        DataDosen26 data = new DataDosen26();

        System.out.println("\n===== ALL LECTURER DATA =====");
        data.dataAllDosen(arrayOfDosen);

        System.out.println("\n===== NUMBER OF LECTURERS PER GENDER =====");
        data.numberOfLecturersPerGender(arrayOfDosen);

        System.out.println("\n===== AVERAGE AGE PER GENDER =====");
        data.AverageAgeOfLecturersPerGender(arrayOfDosen);

        System.out.println("\n===== OLDEST LECTURER =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== YOUNGEST LECTURER =====");
        data.infoDosenMostYoungest(arrayOfDosen);
    }
}