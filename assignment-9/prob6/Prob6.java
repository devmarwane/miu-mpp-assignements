package lesson9.lab9updatedsolutions.prob6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prob6 {
    public static void main(String[] args) {
        List<Set<String>> sets = Arrays.asList(
                new HashSet<>(Arrays.asList("A", "B")),
                new HashSet<>(Arrays.asList("D")),
                new HashSet<>(Arrays.asList("1", "3", "5"))
        );

        System.out.println(union(sets));
    }

    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(new HashSet<>(), (set1, set2) -> {
                    Set<String> resultSet = new HashSet<>(set1);
                    resultSet.addAll(set2);
                    return resultSet;
                });
    }
}
