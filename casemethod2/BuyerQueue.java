package casemethod2;

public class BuyerQueue {
    BuyerNode head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addQueue(Buyer buyer) {
        BuyerNode newNode = new BuyerNode(buyer);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Buyer removeQueue() {
        if (isEmpty()) {
            return null;
        }

        Buyer removed = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return removed;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        BuyerNode current = head;

        System.out.println("=== BUYER QUEUE ===");
        while (current != null) {
            System.out.println(
                "Queue: " + current.data.queueNumber +
                " | Name: " + current.data.name +
                " | Phone: " + current.data.phoneNumber
            );
            current = current.next;
        }
    }
}
