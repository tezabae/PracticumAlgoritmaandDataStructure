package midtermexam;

import java.util.*;

public class JtiReadingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Students
        System.out.print("Enter number of students: ");
        int nStudents = sc.nextInt(); sc.nextLine();
        Student[] students = new Student[nStudents];
        for (int i = 0; i < nStudents; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.print("ID: "); String id = sc.nextLine();
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Study Program: "); String prog = sc.nextLine();
            students[i] = new Student(id, name, prog);
        }

        // Input Books
        System.out.print("\nEnter number of books: ");
        int nBooks = sc.nextInt(); sc.nextLine();
        Book[] books = new Book[nBooks];
        for (int i = 0; i < nBooks; i++) {
            System.out.println("Book " + (i+1) + ":");
            System.out.print("Code: "); String code = sc.nextLine();
            System.out.print("Title: "); String title = sc.nextLine();
            System.out.print("Year: "); int year = sc.nextInt(); sc.nextLine();
            books[i] = new Book(code, title, year);
        }

        // Input Loans
        System.out.print("\nEnter number of loans: ");
        int nLoans = sc.nextInt(); sc.nextLine();
        Loan[] loans = new Loan[nLoans];
        for (int i = 0; i < nLoans; i++) {
            System.out.println("Loan " + (i+1) + ":");
            System.out.print("Student ID: "); String id = sc.nextLine();
            Student std = findStudent(students, id);
            System.out.print("Book Code: "); String code = sc.nextLine();
            Book bk = findBook(books, code);
            System.out.print("Loan Duration (days): "); int dur = sc.nextInt(); sc.nextLine();
            loans[i] = new Loan(std, bk, dur);
        }

        // Menu
        int choice;
        do {
            System.out.println("\n=== Loan Management System in JTI Reading Room ===");
            System.out.println("1. Show Students");
            System.out.println("2. Show Books");
            System.out.println("3. Show Loan");
            System.out.println("4. Sorting based on Fine");
            System.out.println("5. Search Loan by NIM");
            System.out.println("0. Finish");
            System.out.print("Choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nStudent List:");
                    for (Student s : students) s.showStudent();
                    break;
                case 2:
                    System.out.println("\nBook List:");
                    for (Book b : books) b.showBook();
                    break;
                case 3:
                    System.out.println("\nLoan List:");
                    for (Loan l : loans) l.showLoan();
                    break;
                case 4:
                    System.out.print("Sort by Fine (asc/desc): ");
                    String order = sc.nextLine();
                    insertionSort(loans, order.equalsIgnoreCase("asc"));
                    for (Loan l : loans) l.showLoan();
                    break;
                case 5:
                    System.out.print("Enter Student ID (NIM): ");
                    String id = sc.nextLine();
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

    static Student findStudent(Student[] arr, String id) {
        for (Student s : arr) if (s.id.equals(id)) return s;
        return null;
    }

    static Book findBook(Book[] arr, String code) {
        for (Book b : arr) if (b.code.equals(code)) return b;
        return null;
    }

    static void insertionSort(Loan[] loans, boolean ascending) {
        for (int i = 1; i < loans.length; i++) {
            Loan key = loans[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? loans[j].fine > key.fine : loans[j].fine < key.fine)) {
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
                for (int i = 0; i < loans.length; i++) {
                    if (loans[i].std.id.equals(id)) {
                        System.out.println("Index: " + i);
                        loans[i].showLoan();
                    }
                }
                found = true;
                break;
            } else if (loans[mid].std.id.compareTo(id) < 0) left = mid + 1;
            else right = mid - 1;
        }
        if (!found) System.out.println("No loan data found for Student ID " + id);
    }
}
