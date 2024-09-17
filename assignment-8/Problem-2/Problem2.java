package lesson8.lecture.inclassdemo;

import java.util.*;

public class Problem2 {
    enum SortMethod {BYTITLE, BYPRICE}

    private SortMethod method;

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("ATablet", 1200.00, 101),
                new Product("Phone", 800.00, 102),
                new Product("ATablet", 600.00, 103),
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
        // By Price
        Problem2 problem2 = new Problem2();
        problem2.sort(products, SortMethod.BYPRICE);
        System.out.println(products);
        // By Title
        problem2.sort(products, SortMethod.BYTITLE);
        System.out.println(products);

        // Problem D If the title is the same, use the model as another attribute to sort it. Do this by using lambdas.
        // By Price
        problem2.setMethod(SortMethod.BYPRICE);
        problem2.sort(products);
        System.out.println(products);

        // By Title
        problem2.setMethod(SortMethod.BYTITLE);
        problem2.sort(products);
        System.out.println(products);
    }

    // Problem C
    public void sort(List<Product> products, final SortMethod method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                if (method == SortMethod.BYTITLE) {
                    return p1.title.compareTo(p2.title);
                } else {
                    if (p1.price == p2.price) return 0;
                    else if (p1.price < p2.price) return -1;
                    else return 1;
                }
            }
        }
        Collections.sort(products, new ProductComparator());
    }

    // Problem D
    public void setMethod(SortMethod method) {
        this.method = method;
    }

    public void sort(List<Product> products) {
        if (method == SortMethod.BYPRICE) {
            Collections.sort(products, Comparator.comparing(Product::getPrice).thenComparing(Product::getModel));
        } else if (method == SortMethod.BYTITLE) {
            Collections.sort(products, Comparator.comparing(Product::getTitle).thenComparing(Product::getModel));
        }
    }
}
