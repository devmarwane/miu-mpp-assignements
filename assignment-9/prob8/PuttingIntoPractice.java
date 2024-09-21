import javax.management.Query;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("Query 1: Find all transactions from year 2011 and sort them by value (small to high).");
        transactions.stream()
                .filter(t -> t.getYear() >= 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);


        // Query 2: What are all the unique cities where the traders work?
        System.out.println("\nQuery 2: What are all the unique cities where the traders work?");
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("\nQuery 3: Find all traders from Cambridge and sort them by name.");
        traders.stream()
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .forEach(System.out::println);


        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("\nQuery 4: Return a string of all traders names sorted alphabetically.");
        System.out.println(traders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", ")));


        // Query 5: Are there any trader based in Milan?
        System.out.println("\nQuery 5: Are there any trader based in Milan?");
        traders.stream()
                .filter(t -> t.getCity().equals("Milan"))
                .map(Trader::getName)
                .forEach(System.out::println);


        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("\nQuery 6: Update all transactions so that the traders from Milan are set to Cambridge.");
        traders.stream()
                .filter(t -> t.getCity().equals("Milan"))
                .forEach(t -> t.setCity("Cambridge"));
        transactions.forEach(System.out::println);

        // Query 7: What's the highest value in all the transactions?
        System.out.println("\nQuery 7: What's the highest value in all the transactions?");
        System.out.println(transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo)
                .get());
    }
}
