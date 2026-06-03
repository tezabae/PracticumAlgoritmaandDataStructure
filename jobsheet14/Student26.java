package jobsheet14;

public class Student26 {
    String nim, name, classname;
    double ipk;

    public Student26(){
    }
    public Student26(String nm, String nama, String kls, double ip) {
        this.nim = nm;
        this.name = nama;
        this.classname = kls;
        this.ipk = ip;
    }
    void print() {
        System.out.println(nim + " " + name + " " + classname + " " + ipk);
    }
}
