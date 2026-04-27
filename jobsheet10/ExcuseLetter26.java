package jobsheet10;

public class ExcuseLetter26 {
    String id;
    String name;
    String className;
    char typeOfExcuse; // 'S' = Sick, 'I' = Other
    int duration;

    // Constructor without parameter
    public ExcuseLetter26() {}

    // Constructor with parameter
    public ExcuseLetter26(String id, String name, String className, char type, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = type;
        this.duration = duration;
    }
}
