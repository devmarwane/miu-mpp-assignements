package prob2B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderNum;
    private Date orderDate;
    private List<OrderLine> orderLines;

    Order(int orderNum, Date orderDate){
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderLines = new ArrayList<>();
    }

    int getOrderNum(){
        return this.orderNum;
    }

    Date getOrderDate() {
        return this.orderDate;
    }

    List<OrderLine> getOrderLines() {
        return this.orderLines;
    }

    public void addOrderLine(int lineNum, double price, int qnt) {
        this.orderLines.add(new OrderLine(this,lineNum,price, qnt));
    }

    @Override
    public String toString() {
        return "order info: Number "+this.orderNum+" | Date :"+this.orderDate+"\n"+
                this.orderLines;
    }
}
