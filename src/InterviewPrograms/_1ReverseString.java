package InterviewPrograms;

import java.util.Locale;

public class _1ReverseString{

	public static void main(String[] args) {

		// Declare a String variable
		String str = "Praveen Sunkara";

		// Store the length and assign it to len
		int len = str.length();

		// A blank variable to store the reverse of a string
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println("Reverse of String is :" + rev);
		

	}

	

}
