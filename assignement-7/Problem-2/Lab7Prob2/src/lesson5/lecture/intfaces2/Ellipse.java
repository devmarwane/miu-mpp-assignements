package lesson5.lecture.intfaces2;

public class Ellipse implements ClosedCurve{

    private double semiaxes;
    private double elateral;

    Ellipse (double semiaxes, double elateral){
        this.semiaxes = semiaxes;
        this.elateral = elateral;
    }
    @Override
    public double computePerimeter() {
        return 4 * semiaxes * elateral;
    }
}
