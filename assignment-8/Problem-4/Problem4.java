import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Kristy", "alexandra"};
        Arrays.sort(names, String::compareToIgnoreCase);
        List<String> result = Arrays.asList(names);
        result.forEach(System.out::println);
    }
}

/*
String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};
a. Use Arrays.sort() to sort the names by ignore case using Method reference.
b. Convert the sorted names array into List.
c. Print the sorted list using method reference.
 */