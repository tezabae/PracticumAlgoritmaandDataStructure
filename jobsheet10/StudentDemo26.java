package jobsheet10;

import java.util.Scanner;

public class StudentDemo26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentAssignmentStack26 stack = new StudentAssignmentStack26(5);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("5. View the First Assignment Submitted");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    Student26 std = new Student26(nim, name, className);
                    stack.push(std);
                    break;

                case 2:
                    Student26 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);

                        // 🔹 Tambahan konversi ke biner
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student26 topStd = stack.peek();
                    if (topStd != null) {
                        System.out.println("The last assignment comes from " + topStd.name);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Student26 firstStd = stack.first();
                    if (firstStd != null) {
                        System.out.println("The first assignment comes from " + firstStd.name);
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice >= 1 && choice <= 5);

        scan.close();
    }
}
