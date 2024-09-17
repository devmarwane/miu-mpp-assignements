package lesson8.lecture.inclassdemo;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getTitle().compareTo(p2.getTitle());
    }
}
