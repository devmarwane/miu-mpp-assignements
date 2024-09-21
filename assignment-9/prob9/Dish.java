package lesson9.labsolns.prob10;

import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));

    public static void main(String[] args) {
        // Optional, anyMatch(), allMatch(), noneMatch(), findAny(), findFirst()

        // Problem A. Is there any Vegetarian meal available (return type boolean)
        System.out.println("Problem A. Is there any Vegetarian meal available (return type boolean)");
        System.out.println(menu.stream()
                .anyMatch(Dish::isVegetarian));


        // Problem B. Is there any healthy menu have calories less than 1000 (return type boolean)
        System.out.println("\nProblem B. Is there any healthy menu have calories less than 1000 (return type boolean)");
        System.out.println(menu.stream()
                .anyMatch(d -> d.getCalories() < 1000));


        // Problem C. Is there any unhealthy menu have calories greater than 1000 (return type boolean)
        System.out.println("\nProblem C. Is there any unhealthy menu have calories greater than 1000 (return type boolean)");
        System.out.println(menu.stream()
                .anyMatch(d -> d.getCalories() > 1000));


        // Problem D. find and return the first item for the type of MEAT(return type Optional<Dish>)
        System.out.println("\nProblem D. find and return the first item for the type of MEAT(return type Optional<Dish>)");
        Optional<Dish> firstMeat = menu.stream()
                .filter(d -> d.getType().equals(Type.MEAT))
                .findFirst();
        System.out.println(firstMeat);


        // Problem E. calculateTotalCalories() in the menu using reduce. (return int)
        System.out.println("\nProblem E. calculateTotalCalories() in the menu using reduce. (return int)");
        System.out.println(menu.stream()
                .reduce(0, (sum, dish) -> sum + dish.getCalories(), Integer::sum));


        // Problem F. calculateTotalCaloriesMethodReference() in the menu using MethodReferences. (return int)
        System.out.println("\nProblem F. calculateTotalCaloriesMethodReference() in the menu using MethodReferences. (return int)");
        System.out.println(menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum));

    }
}