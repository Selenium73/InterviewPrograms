package InterviewPrograms;

public class $26AlphaNumeric {

	public static void main(String[] args) {

		// Declare the string with alphanumeric
		String str = "3C4ACB9XYZ20";
		int total = 0;

		// By using the enhanced loop to convert the string to character
		for (char c : str.toCharArray()) {

			// Check the if character as a digit or not
			if (Character.isDigit(c)) {
				total += Character.getNumericValue(c);
			}
		}
		System.out.println("Sum of all digits in a given alphanumeric is:" + total);

		// By using for loop
//		for(int i = 0;i<str.length();i++){ 
//		char c = str.charAt(i);
//		  
//		if(Character.isDigit(c)){ 
//		total+=Character.getNumericValue(c); }
//		}
//		System.out.println(total);
		 

	}

}
