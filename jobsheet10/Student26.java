package jobsheet10;

public class Student26 {
   String nim;
    String name;
    String className;
    int grade;

    // Constructor without parameters
    public Student26() {
        this.grade = -1;
    }

    // Constructor with parameter
    public Student26(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1; // default have not been graded yet
    }

    // Method for grading
    void grading(int grade) {
        this.grade = grade;
    } 
}
