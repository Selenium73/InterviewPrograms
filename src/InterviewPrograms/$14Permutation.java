package InterviewPrograms;

final class $14Permutation {

	public static void main(String[] args) {
		permutation("", "abc");
	}

	static void permutation(String value, String str) {

		int n = str.length();
		if (n == 0) {
			System.out.println(value);
		}
		for (int i = 0; i < n; i++) {
			permutation(value + str.charAt(i), str.substring(0, i) + str.substring(i + 1));

		}

	}
	
}
