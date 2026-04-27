package jobsheet10;

public class Student26 {
   String nim;
    String name;
    String className;
    int grade;

    // Constructor tanpa parameter
    public Student26() {
        this.grade = -1;
    }

    // Constructor dengan parameter
    public Student26(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1; // default belum dinilai
    }

    // Method untuk memberi nilai
    void grading(int grade) {
        this.grade = grade;
    } 
}
