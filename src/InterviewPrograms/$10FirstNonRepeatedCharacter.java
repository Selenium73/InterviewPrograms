package InterviewPrograms;

public class $10FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "Praveen";

		for (Character c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
		
	}

}
