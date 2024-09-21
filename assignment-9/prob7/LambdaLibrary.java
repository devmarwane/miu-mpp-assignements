package lesson9.labs.prob7a;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {
    public static Function<List<Employee>, String> employeeListFunction =
            list -> list.stream()
                    .filter(emp -> emp.getSalary() > 100000 &&
                            emp.getLastName().charAt(0) >= 'N' &&
                            emp.getLastName().charAt(0) <= 'Z')
                    .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                    .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                    .collect(Collectors.joining(", "));
}
