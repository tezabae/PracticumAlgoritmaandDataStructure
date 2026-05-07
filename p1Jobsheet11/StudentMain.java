package p1Jobsheet11;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(5);
        int choice;

        do {
            System.out.println("\n=== Academic Service Menu: ");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Students");
            System.out.println("5. Queue Size");
            System.out.println("6. Check rear of the queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String className = sc.nextLine();

                    Student student = new Student(nim, name, studyProgram, className);
                    queue.enqueue(student);
                    break;

                case 2:
                    Student studentBeingServed = queue.dequeue();
                    if (studentBeingServed != null) {
                        System.out.println("Student being served:");
                        studentBeingServed.print();
                    }
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.print();
                    break;

                case 5:
                    System.out.println("Queue Size: " + queue.size);
                    break;

                case 6:
                    queue.viewRear();
                    break;

                case 0:
                    System.out.println("Thanks!!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
}
