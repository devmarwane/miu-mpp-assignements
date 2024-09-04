import prob2B.Order;
import prob2B.OrderFactory;

import java.util.Date;

public class MainProb2B
{
    public static void main(String[] args) {
        Order order = OrderFactory.createOrder(101,new Date(),78.9,2);
        order.addOrderLine(2, 23.4,3);

        System.out.println(order);

    }
}
