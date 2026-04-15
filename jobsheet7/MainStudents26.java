package jobsheet7;
import java.util.Scanner;

public class MainStudents26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many students do you want to input? ");
        int amountStudent = s.nextInt();

        Searchstudent26 data = new Searchstudent26(amountStudent);

        System.out.println("------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");

        for (int i = 0; i < amountStudent; i++) {
            System.out.println("------------------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            s.nextLine(); // buang newline
            System.out.print("Name\t: ");
            String name = s.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students26 std = new Students26(nim, name, age, gpa);
            data.add(std);
        }

        System.out.println("------------------------------------");
        System.out.println("Entire Student Data:");
        data.display();

        System.out.println("____________________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();

        // Sequential Search
        System.out.println("====================================");
        System.out.println("Using Sequential Search");
        int positionSeq = data.findSeqSearch(search);
        data.showPosition(search, positionSeq);
        data.showData(search, positionSeq);

        // Binary Search
        System.out.println("====================================");
        System.out.println("Using Binary Search");
        int positionBin = data.findBinarySearch(search, 0, amountStudent - 1);
        data.showPosition(search, positionBin);
        data.showData(search, positionBin);

        s.close();
    }
}
