package InterviewPrograms;

public class _7ReverseWord {

	public static void main(String[] args) {
		
		// The split() method of String class splits a string in several strings based
		// on the delimiter passed as an argument to it
		String[] words = "Praveen Sunkara".split(" ");

		String rev = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				// The charAt() function returns the character at the given position in a string
				revWord += word.charAt(j);
			}
			rev += revWord + " ";

		} System.out.println(rev);

		
	}

}
