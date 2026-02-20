package practicumJobsheet2;

public class course27 {
    // Attributes
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    // Default constructor
    public course27() {
    }

    // Parameterized constructor
    public course27(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    // Method to display course information
    void showInformation() {
        System.out.println("Kode Course   : " + kodeCourse);
        System.out.println("Nama MataKuliah: " + name);
        System.out.println("SKS           : " + credits);
        System.out.println("Jumlah Jam    : " + numberOfHours);
    }

    // Method to update SKS
    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("SKS berhasil diubah menjadi: " + sksNew);
    }

    // Method to add hours
    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Jam berhasil ditambahkan. Total jam sekarang: " + numberOfHours);
    }

    // Method to reduce hours with validation
    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Jam berhasil dikurangi. Total jam sekarang: " + numberOfHours);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tersisa kurang dari " + hours);
        }
    }
}
