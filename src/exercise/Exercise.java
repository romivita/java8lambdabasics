package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Patricia", "GVt", 35), new Person("Analia", "CVt", 32),
				new Person("Cecilia", "AVt", 28), new Person("Graciela", "PRmr", 55));

		// Step 1 : Sort list by last name
		people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all people in the list");
		//printAll(people);
		printConditionally(people, p -> true);

		// Step 3: Create a method that prints all people that have last name beginning
		// with C
		System.out.println("Printing all people that have last name beginning with C");
		printConditionallyLN(people);
		
		
		System.out.println("Printing all people that have first name beginning with C");
		printConditionally(people, person -> person.getFirstName().startsWith("C"));

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}
		
	}

	private static void printConditionallyLN(List<Person> people) {
		people.forEach((person) -> {
			if (person.getLastName().startsWith("C"))
				System.out.println(person);
		});
		
	}

	private static void printAll(List<Person> people) {
		people.forEach((person) -> System.out.println(person));
		
	}
}
