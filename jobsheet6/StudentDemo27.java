package jobsheet6;
import java.util.Scanner;
public class StudentDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TopStudent27 topStudents = new TopStudent27();
        
        System.out.println("=== Enter 5 Student Data ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            
            Student27 s = new Student27(nim, name, studentClass, gpa);
            topStudents.add(s);
        }
        
        System.out.println("\n=== Original Data ===");
        topStudents.print();
        
        System.out.println("\n=== Bubble Sort (Descending by GPA) ===");
        topStudents.bubbleSort();
        topStudents.print();
        
        sc.close();
    }
}

