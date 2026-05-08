package jobsheet12;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();

        // Create students with names "Student 1", "Student 2", "Student 3"
        Student26 std1 = new Student26("001", "Student 1", "TI-1I", 3.89);
        Student26 std2 = new Student26("002", "Student 2", "TI-1I", 3.45);
        Student26 std3 = new Student26("003", "Student 3", "TI-1I", 3.2);

        // Add them so the list is: 003, 002, 001
        sll.addFirst(std1); // list: 001
        sll.addFirst(std2); // list: 002, 001
        sll.addFirst(std3); // list: 003, 002, 001

        // Accessing and deleting data
        System.out.println("Data at index 1 is:");
        Student26 data = sll.getData(1);
        if (data != null) data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();   // removes Student 3
        sll.removeLast();    // removes Student 1
        sll.print();         // shows Student 3 and Student 2 left

        sll.removeAt(0);     // removes Student 3
        sll.print();         // shows only Student 2
    }
}
