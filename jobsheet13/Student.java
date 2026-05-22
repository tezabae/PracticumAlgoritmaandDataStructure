package jobsheet13;

public class Student {
    String nim, name, classname;
    double gpa;

    public Student(){  
    }
    public Student(String nim, String name, String kls, double ip) {
        this.nim = nim;
        this.name = name;
        this.classname = kls;
        this.gpa = ip;
    }
    void print() {
        System.out.println(nim+" - "+name+" - "+classname+" - "+gpa);
    }
}
