import prob2B.Order;
import prob2B.OrderFactory;
import prop3.Employee;
import prop3.Laptop;

import java.util.Date;
/*We have an inventory system that manages the laptops of a company,
 a laptop can be used by up to one employee
*
* */
public class MainProb3 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell","DF-779");
        Laptop laptop2 = new Laptop("Lenovo","SP-98");

        laptop1.assignEmployee(new Employee("Marwan"));

        laptop2.assignEmployee(new Employee("Luisa"));
        laptop2.assignEmployee(new Employee("Temuulen"));

        System.out.println(laptop1);
        System.out.println(laptop2);

    }
}
