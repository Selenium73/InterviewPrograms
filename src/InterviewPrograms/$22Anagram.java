package InterviewPrograms;

import java.util.Arrays;

public class $22Anagram {

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Toss", "Shot");
	}

	static void isAnagram(String s1, String s2) {

		// Remove all white spaces from s1 & s2
//		String as1 = s1.replaceAll("\\s", "");
//		String as2 = s2.replaceAll("\\s", "");

		boolean status = true;

		char[] ca1 = s1.toLowerCase().toCharArray();
		char[] ca2 = s2.toLowerCase().toCharArray();

		Arrays.sort(ca1);
		Arrays.sort(ca2);

		status = Arrays.equals(ca1, ca2);

		if (status)
			System.out.println(s1 + " and " + s2 + " are anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are not anagrams");
	}

}
