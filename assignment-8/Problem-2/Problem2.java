package lesson8.lecture.inclassdemo;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Apple Tablet", 1200.00, 101),
                new Product("Phone", 800.00, 102),
                new Product("Tablet", 600.00, 103),
                new Product("Laptop", 1100.00, 104),
                new Product("Phone", 850.00, 105)
        ));

        // Problem A
        Collections.sort(products, new ProductPriceComparator());
        System.out.println(products);

        // Problem B
        Collections.sort(products, new ProductTitleComparator());
        System.out.println(products);

        // Problem C

    }
}
