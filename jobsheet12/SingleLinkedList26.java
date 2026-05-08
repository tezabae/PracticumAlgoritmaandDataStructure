
package jobsheet12;

public class SingleLinkedList26 {
    Node26 head;
    Node26 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.println("Linked List: Data");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List is Empty!!");
        }
    }

    void addFirst(Student26 std) {
        Node26 newNode = new Node26(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student26 std) {
        Node26 newNode = new Node26(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Student26 std, String key) {
        Node26 newNode = new Node26(std, null);
        Node26 tmp = head;
        while (tmp != null) {
            if (tmp.data.nim.equalsIgnoreCase(key)) {
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            tmp = tmp.next;
        }
    }

    public void insertAt(int index, Student26 std) {
        if (index < 0) {
            System.out.println("Wrong Index!!");
            return;
        }
        if (index == 0) {
            addFirst(std);
            return;
        }
        Node26 tmp = head;
        int count = 0;
        while (tmp != null && count < index - 1) {
            tmp = tmp.next;
            count++;
        }
        if (tmp == null) {
            System.out.println("Index out of bounds!!");
            return;
        }
        Node26 newNode = new Node26(std, tmp.next);
        tmp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // 2. getData()
    Student26 getData(int idx) {
        if (isEmpty()) {
            System.out.println("Linked List is empty!!");
            return null;
        }
        Node26 tmp = head;
        for (int i = 0; i < idx; i++) {
            if (tmp == null) {
                System.out.println("Index out of bounds!!");
                return null;
            }
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // 3. indexOf()
    int indexOf(String key) {
        if (isEmpty()) {
            System.out.println("Linked List is empty!!");
            return -1;
        }
        Node26 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    // 4. removeFirst()
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // 5. removeLast()
    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node26 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    // 6. remove() by key (name)
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List is empty!!");
        } else {
            Node26 temp = head;
            while (temp != null) {
                if ((temp.data.name.equalsIgnoreCase(key)) && (temp == head)) {
                    removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data.name.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // 7. removeAt() by index
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Index out of bounds!!");
                    return;
                }
            }
            if (temp.next == null) {
                System.out.println("Index out of bounds!!");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
