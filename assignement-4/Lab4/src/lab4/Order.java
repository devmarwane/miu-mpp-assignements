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

    public boolean belongToMonth( int month, int year){
        LocalDate lastMonth = LocalDate.of(year,month,1).minusMonths(1);
        return this.date.getMonthValue() == lastMonth.getMonthValue() &&
                this.date.getYear() == lastMonth.getYear();
    }
}
