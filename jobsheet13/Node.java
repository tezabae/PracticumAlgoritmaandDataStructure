package jobsheet13;

public class Node {
    Student data;
    Node next;
    Node prev;

    public Node(Student data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
