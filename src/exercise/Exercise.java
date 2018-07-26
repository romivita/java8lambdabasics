package exercise;

import java.util.Arrays;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Patricia", "PVt", 35), new Person("Analia", "AVt", 32),
				new Person("Cecilia", "CVt", 28), new Person("Graciela", "GRmr", 55));

		// Step 1 : Sort list by last name
		people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all people in the list");
		printAll(people);

		// Step 3: Create a method that prints all people that have last name beginning
		// with C
		System.out.println("Printing all people that have last name beginning with C");
		printConditionally(people);
		

	}

	private static void printConditionally(List<Person> people) {
		people.forEach((person) -> {
			if (person.getLastName().startsWith("C"))
				System.out.println(person);
		});
		
	}

	private static void printAll(List<Person> people) {
		people.forEach((person) -> System.out.println(person));
		
	}
}
