package jobsheet13;

public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void add(int index, Student data) {
        if (index < 0 || index > getSize()) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == getSize()) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // ✅ Tambahan: insertAfter
    void insertAfter(String key, Student data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                newNode.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                } else {
                    tail = newNode; // kalau temp adalah tail
                }
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key " + key + " tidak ditemukan!");
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("No node exists after " + key);
                } else if (temp.next == tail) {
                    removeLast();
                } else {
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key (" + key + ") not found!");
    }

    Student getFirst() {
        if (!isEmpty()) return head.data;
        return null;
    }

    Student getLast() {
        if (!isEmpty()) return tail.data;
        return null;
    }

    Student getIndex(int index) {
        if (index < 0 || index >= getSize()) {
            System.out.println("Invalid index!");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double Linked List is currently empty!!");
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else {
            System.out.println("Double linked list currently empty!!");
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list currently empty!!");
            return;
        }
        if (index < 0) {
            System.out.println("Invalid index: cannot be negative");
            return;
        }
        if (index >= getSize()) {
            System.out.println("Invalid index: exceeds list size");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }
}
