package lab4;

import java.util.List;

public class Commissioned extends Employee {
    public double getCommission() {
        return commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    private double commission;
    private double baseSalary;
    List<Order> orderList;
    public Commissioned(String empId, double commission, double baseSalary, List<Order> orderList ){
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orderList = orderList;
    }
    public double calcGrossPay(){
        return 0;
    }
}
