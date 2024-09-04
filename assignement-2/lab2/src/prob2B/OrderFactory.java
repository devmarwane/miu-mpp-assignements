package prob2B;

import java.util.Date;

public class OrderFactory {

    public static Order createOrder(int orderNum, Date date, double price, int qnt) {
        if(orderNum <= 0 || date==null || qnt <= 0)
            throw new IllegalArgumentException("Invalid args");

        Order order = new Order(orderNum, date);

        OrderLine orderLine = new OrderLine(order,1,price, qnt);

        order.getOrderLines().add(orderLine);

        return order;
    }
}
