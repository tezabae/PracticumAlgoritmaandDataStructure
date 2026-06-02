package casemethod2;

public class BuyerQueue {

    BuyerNode head;
    BuyerNode tail;

    public BuyerQueue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Add Queue
    public void enqueue(Buyer buyer) {

        BuyerNode newNode = new BuyerNode(buyer);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Process Queue
    public Buyer dequeue() {

        if (isEmpty()) {
            return null;
        }

        Buyer removed = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return removed;
    }

    // Cancel Queue
    public boolean cancelQueue(int queueNumber) {

        if (isEmpty()) {
            return false;
        }

        BuyerNode current = head;

        while (current != null) {

            if (current.data.queueNumber == queueNumber) {

                // hanya satu node
                if (head == tail) {
                    head = null;
                    tail = null;
                }

                // node pertama
                else if (current == head) {
                    head = head.next;
                    head.prev = null;
                }

                // node terakhir
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }

                // node tengah
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Print Queue
    public void printQueue() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("\n==========================================");
        System.out.println("               BUYER QUEUE");
        System.out.println("==========================================");
        System.out.printf("%-10s %-20s %-15s\n",
                "Queue", "Name", "Phone");

        BuyerNode current = head;

        while (current != null) {

            System.out.printf("%-10d %-20s %-15s\n",
                    current.data.queueNumber,
                    current.data.name,
                    current.data.phoneNumber);

            current = current.next;
        }

        System.out.println("==========================================");
    }
}