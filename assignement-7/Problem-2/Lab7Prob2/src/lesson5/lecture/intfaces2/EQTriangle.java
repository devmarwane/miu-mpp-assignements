package lesson5.lecture.intfaces2;

public class EQTriangle implements  Polygon
{
    private double side;
    public EQTriangle(double side ) {
        this.side = side;
    }

public double[] getLengths() {
    return new double[] {side,side,side};
}
}
