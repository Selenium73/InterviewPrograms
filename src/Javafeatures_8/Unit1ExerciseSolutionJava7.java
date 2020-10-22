package Javafeatures_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Praveen","Sunkara",28),
				new Person("Annapurna","Chunduru",31),
				new Person("Shiva","Mandala",28),
				new Person("Sunveer","Chilika",27),
				new Person("Varshini","Kalakoti",25)
				);

		//1. Sort list by lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});

		//2. Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);

		//3. Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C");
		//printLastNameBeginningWithC(people);
		
		
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
	}

//	private static void printLastNameBeginningWithC(List<Person> people) {
//		for(Person p:people) {
//			if(p.getLastName().startsWith("C"))
//				System.out.println(p);
//		}
//	}
	
	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people) {
			if(condition.test(p))
				System.out.println(p);
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
	}

}

//interface Condition() {
//	boolean test(Person p);
//}