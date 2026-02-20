package practicumJobsheet2;

public class courseMain27 {
    public static void main(String[] args) {
        // Object using default constructor
        course27 course1 = new course27();
        course1.kodeCourse = "IF101";
        course1.name = "Algoritma dan Struktur Data";
        course1.credits = 3;
        course1.numberOfHours = 6;

        System.out.println("=== Informasi Course 1 ===");
        course1.showInformation();
        course1.updateSKS(4);
        course1.addHour(2);
        course1.reduceHours(3);
        course1.showInformation();

        // Object using parameterized constructor
        course27 course2 = new course27("IF102", "Pemrograman Java", 2, 4);

        System.out.println("\n=== Informasi Course 2 ===");
        course2.showInformation();
        course2.updateSKS(3);
        course2.addHour(1);
        course2.reduceHours(5); // will show validation message
        course2.showInformation();
    }
}
