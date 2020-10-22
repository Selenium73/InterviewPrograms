package Javafeatures_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Praveen","Sunkara",28),
				new Person("Annapurna","Chunduru",31),
				new Person("Shiva","Mandala",28),
				new Person("Sunveer","Chilika",27),
				new Person("Varshini","Kalakoti",25)
				);
		
		//1. Sort list by lastname
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//2. Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		
		//3. Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("Printing all persons with first name beginning with S");
		printConditionally(people, p -> p.getFirstName().startsWith("S"));

	}
	
	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people ) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	public static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}

}

interface Condition{
	boolean test(Person p);
}
