package lab4;

public class Salaried extends Employee {
    private double salary;
    public Salaried (String empId, double salary){
        super(empId);
        this.salary = salary;
    }
    public double calcGrossPay(){
        return 0;
    }
}
