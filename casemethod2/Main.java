package casemethod2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BuyerQueue queue = new BuyerQueue();
        OrderList orders = new OrderList();

        int queueNumber = 1;
        int menu;

        do {

            System.out.println("\n================================");
            System.out.println("ROYAL DELISH RESTAURANT");
            System.out.println("================================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Process Queue");
            System.out.println("4. Cancel Queue");
            System.out.println("5. Order Report");
            System.out.println("6. Exit");
            System.out.print("Choose Menu : ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:

                    System.out.print("Buyer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Phone Number : ");
                    String phone = sc.nextLine();

                    Buyer buyer =
                            new Buyer(
                                    queueNumber,
                                    name,
                                    phone);

                    queue.enqueue(buyer);

                    System.out.println(
                            "Queue Number "
                            + queueNumber
                            + " Added");

                    queueNumber++;

                    break;

                case 2:

                    queue.printQueue();

                    break;

                case 3:

                    Buyer served = queue.dequeue();

                    if (served == null) {

                        System.out.println("Queue Empty");

                    } else {

                        System.out.println(
                                "\nServing Queue : "
                                + served.queueNumber);

                        System.out.println(
                                "Buyer : "
                                + served.name);

                        System.out.print("Order Code : ");
                        int code = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Order Name : ");
                        String orderName = sc.nextLine();

                        System.out.print("Price : ");
                        int price = sc.nextInt();

                        System.out.print("Quantity : ");
                        int quantity = sc.nextInt();

                        Order order =
                                new Order(
                                        code,
                                        orderName,
                                        price,
                                        quantity);

                        orders.addOrder(order);

                        System.out.println(
                                "Order Saved Successfully");
                    }

                    break;

                case 4:

                    System.out.print(
                            "Input Queue Number To Cancel : ");

                    int cancelNumber = sc.nextInt();

                    boolean found =
                            queue.cancelQueue(cancelNumber);

                    if (found) {

                        System.out.println(
                                "Queue Number "
                                + cancelNumber
                                + " Successfully Cancelled");

                    } else {

                        System.out.println(
                                "Queue Number Not Found");
                    }

                    break;

                case 5:

                    orders.printOrders();

                    break;

                case 6:

                    System.out.println("Program Finished");

                    break;

                default:

                    System.out.println("Wrong Menu");
            }

        } while (menu != 6);

        sc.close();
    }
}