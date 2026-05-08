package jobsheet12;

public class Student26 {
    String nim, name, className;
    double gpa;

    public Student26() {
    }

    public Student26(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }
    void print() {
        System.out.println(nim + " " + name + " " + className + " " + gpa);
    }
}
