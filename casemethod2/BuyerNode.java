package casemethod2;

public class BuyerNode {
    Buyer data;
    BuyerNode prev, next;

    public BuyerNode(Buyer data) {
        this.data = data;
        prev = next = null;
    }
}
