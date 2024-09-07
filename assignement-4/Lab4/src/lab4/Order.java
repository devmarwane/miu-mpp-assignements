package lab4;

import java.time.LocalDate;

public class Order {
    private String num;
    private LocalDate date;
    private double amount;
    public Order(String num, LocalDate date, double amount) {
        this.num = num;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public double getAmount() {
        return this.amount;
    }
}
