package casemethod2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BuyerQueue queue = new BuyerQueue();
        OrderList orders = new OrderList();

        int queueNumber = 1;
        int choice;

        do {
            System.out.println("\n=== ROYAL DELISH ===");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Process Queue & Add Order");
            System.out.println("4. Order Report");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Buyer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    Buyer buyer = new Buyer(queueNumber, name, phone);

                    queue.addQueue(buyer);

                    System.out.println("Queue added!");
                    queueNumber++;

                    break;

                case 2:
                    queue.printQueue();
                    break;

                case 3:
                    Buyer served = queue.removeQueue();

                    if (served == null) {
                        System.out.println("Queue empty!");
                    } else {

                        System.out.println("Serving: " + served.name);

                        System.out.print("Order Code: ");
                        int code = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Order Name: ");
                        String orderName = sc.nextLine();

                        System.out.print("Price: ");
                        int price = sc.nextInt();

                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();

                        Order order = new Order(code, orderName, price, qty);

                        orders.addOrder(order);

                        System.out.println("Order saved!");
                    }

                    break;

                case 4:
                    orders.printOrders();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
