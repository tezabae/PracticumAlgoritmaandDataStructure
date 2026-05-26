package casemethod2;

public class Order {
    int orderCode;
    String orderName;
    int price;
    int quantity;

    public Order(int orderCode, String orderName, int price, int quantity) {
        this.orderCode = orderCode;
        this.orderName = orderName;
        this.price = price;
        this.quantity = quantity;
    }

    public int totalPrice() {
        return price * quantity;
    }
}
