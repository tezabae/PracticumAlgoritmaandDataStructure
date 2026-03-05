package Jobsheet3;

public class dosen26 {
    String code;
    String name;
    boolean gender;
    int age;

    // Constructor
    public dosen26(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    // Method to display dosen information
    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }
    
}
