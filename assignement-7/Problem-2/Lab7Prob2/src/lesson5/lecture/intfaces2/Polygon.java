package lesson5.lecture.intfaces2;

public interface Polygon extends ClosedCurve{
    @Override
    default double computePerimeter() {
        double [] lens = getLengths();
        double perimeter = 0;
        for (double x: lens   ){
            perimeter += x;
        }
        return perimeter;
    }

    double [] getLengths();
}
