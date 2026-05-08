package jobsheet12;
import java.util.Scanner;

public class SLLMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList26 sll = new SingleLinkedList26();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Insert At Index");
            System.out.println("5. Print Linked List");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student26 stdFirst = inputStudent(sc);
                    sll.addFirst(stdFirst);
                    break;
                case 2:
                    Student26 stdLast = inputStudent(sc);
                    sll.addLast(stdLast);
                    break;
                case 3:
                    System.out.print("Enter key NIM (after which to insert): ");
                    String key = sc.nextLine();
                    Student26 stdAfter = inputStudent(sc);
                    sll.insertAfter(stdAfter, key);
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    Student26 stdAt = inputStudent(sc);
                    sll.insertAt(idx, stdAt);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static Student26 inputStudent(Scanner sc) {
        System.out.print("Enter NIM: ");
        String nim = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Class: ");
        String className = sc.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine(); 
        return new Student26(nim, name, className, gpa);
    }
}
