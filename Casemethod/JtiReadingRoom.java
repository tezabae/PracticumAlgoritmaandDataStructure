package Casemethod;

import java.util.Arrays;
import java.util.Scanner;

public class JtiReadingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = {
                new Student("22001", "Abdul", "Informatics Engineering"),
                new Student("22002", "Bestari", "Informatics Engineering"),
                new Student("22003", "Gandi", "Business Information System")
        };

        Book[] books = {
                new Book("B001", "Algorithm", 2020),
                new Book("B002", "Database", 2019),
                new Book("B003", "Programming", 2021),
                new Book("B004", "Physics", 2024)
        };

        Loan[] loans = {
                new Loan(students[0], books[0], 7),
                new Loan(students[1], books[1], 3),
                new Loan(students[2], books[2], 10),
                new Loan(students[2], books[3], 6),
                new Loan(students[0], books[1], 4)
        };

        int choice;
        do {
            System.out.println("\n=== Loan Management System in JTI Reading Room ===");
            System.out.println("1. Show Students");
            System.out.println("2. Show Books");
            System.out.println("3. Show Loan");
            System.out.println("4. Sorting based on Fine (Descending)");
            System.out.println("5. Search Loan by NIM");
            System.out.println("0. Finish");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println("Id: " + s.id + " | Name: " + s.name +
                                " | Study Program: " + s.studyProgram);
                    }
                    break;
                case 2:
                    System.out.println("\nBook List:");
                    for (Book b : books) {
                        System.out.println("Code: " + b.code + " | Title: " + b.title +
                                " | Year: " + b.year);
                    }
                    break;
                case 3:
                    System.out.println("\nLoan List:");
                    for (Loan l : loans) {
                        l.showLoan();
                    }
                    break;
                case 4:
                    System.out.println("\nLoan List Sorted by Fine (Descending):");
                    insertionSort(loans);
                    for (Loan l : loans) {
                        l.showLoan();
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID (NIM): ");
                    String id = sc.next();
                    searchLoanByID(loans, id);
                    break;
                case 0:
                    System.out.println("Program finished.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }

    static void insertionSort(Loan[] loans) {
        for (int i = 1; i < loans.length; i++) {
            Loan key = loans[i];
            int j = i - 1;
            while (j >= 0 && loans[j].fine < key.fine) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = key;
        }
    }

    static void searchLoanByID(Loan[] loans, String id) {
        Arrays.sort(loans, (a, b) -> a.std.id.compareTo(b.std.id));
        int left = 0, right = loans.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (loans[mid].std.id.equals(id)) {
                System.out.println("Loan(s) for Student ID " + id + ":");
                for (Loan l : loans) {
                    if (l.std.id.equals(id)) l.showLoan();
                }
                found = true;
                break;
            } else if (loans[mid].std.id.compareTo(id) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("No loan data found for Student ID " + id);
        }
    }
}
