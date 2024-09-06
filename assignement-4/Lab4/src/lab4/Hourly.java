package lab4;

public class Hourly extends Employee{
    double hourlyWage ;
    double hoursPerWeek;
    public Hourly(String empId, double hourlyWage, double hoursPerWeek){
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
    public double calcGrossPay(){
        return 0;
    }
}
