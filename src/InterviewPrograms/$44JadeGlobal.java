package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class $44JadeGlobal {

	public static void main(String[] args) {
		//		int x = 10;
		//		 System.out.println(x++ + ++x); //22

		//		int k=2; 
		//		for (int p = 0; p < 6; p=p+2) {
		//			System.out.println(p+" "+p+k); // 0 02 2 22 4 42
		//		}

		//		StringBuilder sb = new StringBuilder("ab");
		//	    sb.append("cd");
		//	    String str = new String(sb);
		//	    str.concat("ef");
		//	    System.out.println(str); //abcd


		//		List<String> list = new ArrayList<String>();
		//		list.add("A");
		//		list.add("C");
		//		list.add("E");
		//		list.add("D");
		//		list.add(1, "B");
		//		list.set(4, "F");
		//		System.out.println(list); //[A,B,C,E,F] 


		//		int i =1;
		//		String str = "Praveen";
		//		String str1 = str.substring(i);
		//		System.out.println(str1); //raveen
		//		String str2 = str.substring(0, i);
		//		System.out.println(str2); //p
		//		System.out.println(str1+str2); //raveenP

		String userInput = "a,b,c,f";
		String inputStringArray[] = userInput.split("");
		//System.out.println("Input String array : " + inputStringArray);

		// Creating a String array containing alphabets
		String alphabets[] = "abcdefghijklmnopqrstuvwxyz".split("");
		//System.out.println("Alphabets array : " + alphabets);

		// Creating HashSet to find intersections
		HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
		HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));

		System.out.println("User Input in set :"+s1);
		System.out.println("Alphabets :"+s2);

		// Intersection of above sets
		s2.removeAll(s1);

		// Missing alphabets
		System.out.println("Missing alphabets :"+ s2);

	}

}
