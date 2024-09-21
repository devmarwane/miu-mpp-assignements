package lesson9.labs.prob7a;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        // Problem A
        System.out.println("Problem A.");
        list.stream()
                .filter(emp -> emp.getSalary() > 100000 &&
                        emp.getLastName().charAt(0) >= 'N' &&
                        emp.getLastName().charAt(0) <= 'Z')
                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                .forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

        // Problem B
        System.out.println("\nProblem B.");
        String result = LambdaLibrary.employeeListFunction.apply(list);
        System.out.println(result);
    }

}
