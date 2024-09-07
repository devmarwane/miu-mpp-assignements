package lab4;

public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;


    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getNetPay() {

        return this.grossPay - this.fica - this.state - this.local - this.medicare - this.socialSecurity;
    }

    public void print() {
        System.out.println("Paystub:");
        System.out.println("  Gross Pay: " + this.grossPay);
        System.out.println("  Fica: " + this.fica);
        System.out.println("  State: " + this.state);
        System.out.println("  Local: " + this.local );
        System.out.println("  Medicare: " + this.medicare );
        System.out.println("  Social Security: " + this.socialSecurity );
        System.out.println("NET PAY: " + this.getNetPay() );

    }

   /* public static void main (String [] args){
        Paycheck
    }*/
}
;