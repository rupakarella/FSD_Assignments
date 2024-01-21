package set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// Create a HashSet of Person objects
		HashSet<Person> personHashSet = new HashSet<>();

		// Add Person objects to the HashSet
		personHashSet.add(new Person("Alice", 25));
		personHashSet.add(new Person("Bob", 30));
		personHashSet.add(new Person("Charlie", 22));

		// Add a duplicate Person object (will not be added to the set)
		personHashSet.add(new Person("Alice", 25));

		// Display the elements in the HashSet
		System.out.println("People in the HashSet:");
		for (Person person : personHashSet) {
			System.out.println(person);
		}
	}
}
