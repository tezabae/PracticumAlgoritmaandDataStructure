package jobsheet12Assignment;

public class QueueStudentService26 {
    Node26 front, rear;
    int size, maxSize;

    public QueueStudentService26(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    public void enqueue(Student26 std) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        Node26 newNode = new Node26(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(std.name + " joined the queue.");
    }

    public Student26 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Student26 std = front.data;
        front = front.next;
        size--;
        if (front == null) rear = null;
        System.out.println(std.name + " is called next.");
        return std;
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Front student: ");
            front.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Rear student: ");
            rear.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void printSize() {
        System.out.println("Total students in queue: " + size);
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue data:");
        Node26 tmp = front;
        while (tmp != null) {
            tmp.data.print();
            tmp = tmp.next;
        }
    }
}

