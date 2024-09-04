package prob2B;

public class OrderLine {
    private int orderLineNum;
    private double price;
    private int quantity;
    private Order order;

    OrderLine(Order order, int lineNum, double price, int quantity) {
        this.order = order;
        this.orderLineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nItem No: "+this.orderLineNum+" x quantity : "+this.quantity+" x price : "+ this.price+" - total price : "+this.quantity*this.price;
    }
}
