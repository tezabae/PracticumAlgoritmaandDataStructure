package p1Jobsheet11Assignment;

public class StudentQueue {

    Student[] data;
    int front, rear, size, max;
    int processed = 0;

    public StudentQueue(int max) {
        this.max = max;
        data = new Student[max];
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student s) {

        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = s;
        size++;

        System.out.println(s.name + " added to queue.");
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Students processed:");

        for (int i = 0; i < 2; i++) {

            if (!isEmpty()) {

                Student s = data[front];
                s.print();

                front = (front + 1) % max;
                size--;
                processed++;

                if (size == 0) {
                    front = rear = -1;
                }
            }
        }
    }

    void printQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;

        while (true) {
            data[i].print();

            if (i == rear) {
                break;
            }

            i = (i + 1) % max;
        }

        System.out.println("Total in queue: " + size);
    }

    void peekFront() {

        if (size >= 1) {
            System.out.println("Front student:");
            data[front].print();
        }

        if (size >= 2) {
            System.out.println("Second front student:");
            data[(front + 1) % max].print();
        }
    }

    void peekRear() {

        if (!isEmpty()) {
            System.out.println("Rear student:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void printProcessed() {
        System.out.println("Students already processed: " + processed);
    }

    void remaining() {
        System.out.println("Students not yet processed: " + (30 - processed));
    }
}

