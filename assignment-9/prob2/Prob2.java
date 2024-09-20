package lesson9.lab9updatedsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Prob2 {
    /*
    creates an IntStream using the iterate method. The method prints to the console the
    first num squares.
     */
   public static void printSquares(int num){
       Stream.iterate(1, n -> n + 1)
            .limit(num)
               .map(n-> n*n)
               .forEach(System.out::println);

    }


    public static void main(String[] args) {
       Prob2.printSquares(3);
       Prob2.printSquares(9);

    }
}
