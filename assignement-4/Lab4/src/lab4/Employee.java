package lab4;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {

    }

    public void print(int month, int year) {

    }

    public Paycheck calcCompensation() {
        return null;
    }

    public abstract double calcGrossPay();
}
