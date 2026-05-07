package p1Jobsheet11Assignment;

import java.util.Scanner;

public class MainKRS {

    static void menu() {

        System.out.println("\n=== KRS Approval Queue ===");
        System.out.println("1. Add Student");
        System.out.println("2. Process KRS Approval");
        System.out.println("3. Show All Queue");
        System.out.println("4. Show Front Queue");
        System.out.println("5. Show Rear Queue");
        System.out.println("6. Total Queue");
        System.out.println("7. Total Processed");
        System.out.println("8. Remaining Students");
        System.out.println("9. Clear Queue");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentQueue queue = new StudentQueue(10);

        int choice;

        do {

            menu();

            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();

                    System.out.print("Class: ");
                    String className = sc.nextLine();

                    Student s = new Student(nim, name, studyProgram, className);

                    queue.enqueue(s);

                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    queue.peekFront();
                    break;

                case 5:
                    queue.peekRear();
                    break;

                case 6:
                    System.out.println("Total queue: " + queue.size);
                    break;

                case 7:
                    queue.printProcessed();
                    break;

                case 8:
                    queue.remaining();
                    break;

                case 9:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }

        } while (choice != 0);
    }
}
