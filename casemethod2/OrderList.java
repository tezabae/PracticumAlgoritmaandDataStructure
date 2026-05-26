package casemethod2;

public class OrderList {
    OrderNode head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortOrders() {
        if (head == null) return;

        boolean swapped;

        do {
            swapped = false;
            OrderNode current = head;

            while (current.next != null) {
                if (current.data.orderName.compareToIgnoreCase(
                        current.next.data.orderName) > 0) {

                    Order temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);
    }

    public void printOrders() {
        if (isEmpty()) {
            System.out.println("No orders yet!");
            return;
        }

        sortOrders();

        OrderNode current = head;
        int totalRevenue = 0;

        System.out.println("=== ORDER REPORT ===");

        while (current != null) {
            System.out.println(
                current.data.orderCode + " | " +
                current.data.orderName + " | " +
                current.data.price + " | Qty: " +
                current.data.quantity + " | Total: " +
                current.data.totalPrice()
            );

            totalRevenue += current.data.totalPrice();

            current = current.next;
        }

        System.out.println("====================");
        System.out.println("Total Revenue: " + totalRevenue);
    }
}
