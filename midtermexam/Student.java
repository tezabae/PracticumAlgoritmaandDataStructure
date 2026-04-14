package midtermexam;

public class Student {
    String id;
    String name;
    String studyProgram;

    public Student(String id, String name, String studyProgram) {
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void showStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Study Program: " + studyProgram);
    }
}

