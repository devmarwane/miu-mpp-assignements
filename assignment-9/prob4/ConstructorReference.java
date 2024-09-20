package lesson9.lecture.streamandoperations;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};

		// Query 1  : Print only Female candidates names
		System.out.print("Query 1. Female candidates names: ");
		Arrays.stream(list)
				.filter(x -> x.getGender().equals("Female"))
				.map(Human::getName)
				.forEach(System.out::println);

        /* Query 2 : Create an object for the Type of Human class by choosing suitable Interface
         for the three constructors using ClassName::new. Then print the object status */
		System.out.println("\nQuery 2.");
		Function<String, Human> supplier1 = Human::new;
		BiFunction<String, Integer, Human> supplier2 = Human::new;
		TriFunction<String, Integer, String, Human> supplier3 = Human::new;

		Human h1 = supplier1.apply("Temuulen");
		Human h2 = supplier2.apply("Marwane", 18);
		Human h3 = supplier3.apply("Luisa", 18, "Female");

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

		// Query 3 : Count the male candidates whose age is more than 30
		long maleCount = Arrays.stream(list)
				.filter(x -> x.getGender().equals("Male") &&
						x.getAge() > 30)
				.count();
		System.out.println("\nQuery 3. Count of male candidates older than 30: " + maleCount);

	}

}
