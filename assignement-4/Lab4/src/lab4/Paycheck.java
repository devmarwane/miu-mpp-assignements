package lab4;

public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    private Paycheck(){

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

    public Paycheck getNetCheck(){
        //@todo
        return null;
    }
    public void print(){
        /**
         * @// TODO: 6/09/2024  Implement this method
         */
    }
}
