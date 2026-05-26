package casemethod2;

public class OrderNode {
    Order data;
    OrderNode prev, next;

    public OrderNode(Order data) {
        this.data = data;
        prev = next = null;
    }
}
