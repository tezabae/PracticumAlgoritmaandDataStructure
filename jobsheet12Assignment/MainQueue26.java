package jobsheet12Assignment;
import java.util.Scanner;
public class MainQueue26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueStudentService26 queue = new QueueStudentService26(5); // max 5 students
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Register student (enqueue)");
            System.out.println("2. Call next student (dequeue)");
            System.out.println("3. Show front student");
            System.out.println("4. Show rear student");
            System.out.println("5. Show total students");
            System.out.println("6. Print all queue");
            System.out.println("7. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String className = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = Double.parseDouble(sc.nextLine().replace(",", "."));
                    Student26 std = new Student26(nim, name, className, gpa);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printSize();
                    break;
                case 6:
                    queue.printQueue();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
  

