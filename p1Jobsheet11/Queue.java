package p1Jobsheet11;

public class Queue {
    int[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: " + data[front]);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (true) {
                System.out.print(data[i] + " ");
                if (i == rear) break;
                i = (i + 1) % max;
            }
            System.out.println("\nNumber of elements: " + size);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("All data has been successfully removed!");
    }

    void enqueue(int dt) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
            System.out.printf("%d is successfully added at index %d\n", dt, rear);
        } else {
            System.out.println("Queue is full!!!");
        }
    }

    int dequeue() {
        int dt = 0;
        if (!isEmpty()) {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        } else {
            System.out.println("Queue is empty!!!");
        }
        return dt;
    }
}