package jobsheet12;

public class SingleLinkedList26 {
    Node26 head;
    Node26 tail;

boolean isEmpty() {
    return head == null;
    }

void print () {
    if (!isEmpty()) {
        Node26 tmp = head;
        System.out.println("Linked List: Data");
        while(tmp!=null) {
            tmp.data.print();
            tmp = tmp.next;
        }
    }else{
        System.out.println("Linked List is Empty!!");
    }
}
void addFirst(Student26 std) {
    Node26 newNode = new Node26(std,null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
void addLast(Student26 std) {
    Node26 newNode = new Node26(std,null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
void insertAfter(Student26 std, String key) {
    Node26 newNode = new Node26(std,null);
        Node26 tmp = head;
        do {
            if (tmp.data.nim.equalsIgnoreCase(key)) {
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }
public void insertAt(int index, Student26 std) {
    if (index < 0) {
        System.out.println("Wrong Index!!");
        return;
    }

    // jika index = 0, langsung addFirst
    if (index == 0) {
        addFirst(std);
        return;
    }

    Node26 tmp = head;
    int count = 0;

    // maju sampai posisi index-1
    while (tmp != null && count < index - 1) {
        tmp = tmp.next;
        count++;
    }

    // kalau tmp == null berarti index lebih besar dari jumlah node
    if (tmp == null) {
        System.out.println("Index out of bounds!!");
        return;
    }

    // sisipkan node baru setelah tmp
    Node26 newNode = new Node26(std, tmp.next);
    tmp.next = newNode;

    // kalau newNode jadi elemen terakhir, update tail
    if (newNode.next == null) {
        tail = newNode;
    }
}
}
