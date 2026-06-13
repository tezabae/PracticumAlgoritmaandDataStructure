package jobsheet16;
import java.util.*;

class Student {
    String id;
    String name;
    String phone;

    public Student(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + phone;
    }
}

class Course {
    String code;
    String title;
    int credits;

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return code + "\t" + title + "\t" + credits;
    }
}

class Grade {
    Student student;
    Course course;
    double score;

    public Grade(Student student, Course course, double score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    @Override
    public String toString() {
        return student.id + "\t" + student.name + "\t" +
               course.title + "\t" + course.credits + "\t" + score;
    }
}

public class SemesterGradeSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Grade> grades = new ArrayList<>();
    static Queue<Student> deleteQueue = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("********************************************");
            System.out.println("SEMESTER STUDENT GRADE MANAGEMENT SYSTEM");
            System.out.println("********************************************");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Input Grade");
            System.out.println("4. Display Grades");
            System.out.println("5. Search Student Grade");
            System.out.println("6. Sort Grade Data");
            System.out.println("7. Delete Student (Queue)");
            System.out.println("8. Exit");
            System.out.println("********************************************");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addCourse();
                case 3 -> inputGrade();
                case 4 -> displayGrades();
                case 5 -> searchGrade();
                case 6 -> sortGrades();
                case 7 -> deleteStudentQueue();
            }
        } while (choice != 8);
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        students.add(new Student(id, name, phone));
        System.out.println("Student added successfully!");
    }

    static void addCourse() {
        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Course Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Credits: ");
        int credits = sc.nextInt();
        sc.nextLine();
        courses.add(new Course(code, title, credits));
        System.out.println("Course added successfully!");
    }

    static void inputGrade() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        Student s = students.stream()
                .filter(x -> x.id.equals(id))
                .findFirst().orElse(null);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();
        Course c = courses.stream()
                .filter(x -> x.code.equals(code))
                .findFirst().orElse(null);

        if (c == null) {
            System.out.println("Course not found!");
            return;
        }

        System.out.print("Enter Grade: ");
        double score = sc.nextDouble();
        sc.nextLine();

        grades.add(new Grade(s, c, score));
        System.out.println("Grade successfully added!");
    }

    static void displayGrades() {
        System.out.println("\nSTUDENT GRADES LIST");
        System.out.println("ID\tName\tCourse\tCredits\tGrade");
        grades.forEach(System.out::println);
    }

    static void searchGrade() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        grades.stream()
                .filter(g -> g.student.id.equals(id))
                .forEach(System.out::println);
    }

    static void sortGrades() {
        grades.sort((a, b) -> Double.compare(b.score, a.score));
        System.out.println("\nGrades sorted (descending):");
        displayGrades();
    }

    static void deleteStudentQueue() {
        System.out.print("Enter Student ID to delete: ");
        String id = sc.nextLine();
        Student s = students.stream()
                .filter(x -> x.id.equals(id))
                .findFirst().orElse(null);

        if (s != null) {
            deleteQueue.add(s);
            students.remove(s);
            System.out.println("Student " + s.name + " added to deletion queue.");
        } else {
            System.out.println("Student not found!");
        }

        // Process queue
        if (!deleteQueue.isEmpty()) {
            Student removed = deleteQueue.poll();
            System.out.println("Student " + removed.name + " has been deleted from the system.");
        }
    }
}