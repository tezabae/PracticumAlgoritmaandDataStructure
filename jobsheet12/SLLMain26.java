package jobsheet12;
import java.util.Scanner;

public class SLLMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList26 sll = new SingleLinkedList26();

        Student26 std1 = new Student26("001", "Zhao Yufan", "TI-1I", 3.95);
        Student26 std2 = new Student26("002", "Edwards Martin", "TI-1I", 3.90);
        Student26 std3 = new Student26("003", "Kim Juhoon", "TI-1I", 3.91);
        Student26 std4 = new Student26("004", "Eom SeongHyeon", "TI-1I", 3.92);
        Student26 std5 = new Student26("005", "Ahn Keonho", "TI-1I", 3.93);

        sll.print();
        sll.addFirst(std5);   // 005
        sll.print();
        sll.addLast(std1);    // 005, 001
        sll.print();

        sll.insertAfter(std4, "005"); // 005, 004, 001
        sll.insertAfter(std3, "004"); // 005, 004, 003, 001
        sll.insertAt(2, std2);        // 005, 004, 003, 002, 001
        sll.print();
    }
}
