package InterviewPrograms;

public class $16NumberOfVowels {

	public static void main(String[] args) {

		int vowelCount = 0, consonantCount = 0;

		String str = "Praveen Sunkara";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				consonantCount++;
			}

		}

		System.out.println("Number of vowels:" + vowelCount);
		System.out.println("Number of consonants:" + consonantCount);

	}

}
