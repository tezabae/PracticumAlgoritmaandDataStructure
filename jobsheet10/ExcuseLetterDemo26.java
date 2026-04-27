package jobsheet10;

import java.util.Scanner;

public class ExcuseLetterDemo26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack26 stack = new ExcuseLetterStack26(5);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. View All Excuse Letters"); // 🔹 tambahan menu
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S/I): ");
                    char type = scan.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter26 letter = new ExcuseLetter26(id, name, className, type, duration);
                    stack.push(letter);
                    break;

                case 2:
                    ExcuseLetter26 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing excuse letter from " + processed.name +
                                           " (" + processed.className + "), Type: " + processed.typeOfExcuse +
                                           ", Duration: " + processed.duration + " days");
                    }
                    break;

                case 3:
                    ExcuseLetter26 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest letter: " + latest.name + " (" + latest.className + ")");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    stack.searchByName(searchName);
                    break;

                case 5: // 🔹 tambahan case untuk print semua surat izin
                    stack.printAll();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice >= 1 && choice <= 5);

        scan.close();
    }
}
