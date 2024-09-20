package lesson9.lecture.streamandoperations;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
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

	public boolean isFemale(){
		return getGender().equals("Female");
	}
	public boolean isMale(){
		return getGender().equals("Male");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};


    // Query 1  : Print only Female candidates names
	System.out.println("Females");
	Stream.of(list)
	.filter(Human::isFemale).map(Human::getName).forEach(System.out::println);

    /* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new. 
                 Then print the object status */
 	String[] datah1 = {"Adam"};
	Human h1 = Arrays.stream(datah1)
			.map(Human::new)
			.findFirst().get();
	System.out.println("First Human:" + h1);



	// Query 3 : Count the male candidates whose age is more than 30

	Predicate<Human> isOlder30 = h->h.getAge() > 30;
	System.out.println("Males older than 30: " +
	Stream.of(list)
			.filter(Human::isMale)
			.filter(isOlder30)
			.count());
    
   }



}
