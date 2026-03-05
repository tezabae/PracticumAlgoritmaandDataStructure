package Jobsheet3;

public class Dosen26 {
    String code;
    String name;
    boolean gender;
    int age;

    // Constructor
    public Dosen26(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Method to display lecturer information
    void printInfo() {
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + (gender ? "Male" : "Female"));
        System.out.println("Age    : " + age);
        System.out.println("-----------------------------");
    }
}