package jobsheet7;

public class Students26 {
    int nim;
    String name;
    int age;
    double gpa;

    // Constructor
    public Students26(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method untuk menampilkan data mahasiswa
    public void display() {
        System.out.println("NIM  : " + nim);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("GPA  : " + gpa);
    }
}
