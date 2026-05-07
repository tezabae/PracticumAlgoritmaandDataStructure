package p1Jobsheet11;

public class Student {
    String nim, name, studyProgram, className;

    public Student(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    void print() {
    System.out.println(nim + " - " + name + " - " + studyProgram + " - " + className);
}

    void printDetail() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Study Program: " + studyProgram);
        System.out.println("Class: " + className);
    }
}
