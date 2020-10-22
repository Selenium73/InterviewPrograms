package InterviewPrograms;

public class _8AlternateStringReverse {

	public static void main(String[] args) {

		String[] str = "Praveen Kumar Sunkara".split("\\s");
		String rev = "";
		String ans = "";

		for (int i = 0; i < str.length; i++) {
			String words = str[i];
			if (i % 2 == 0) {
				for (int j = words.length() - 1; j >= 0; j--) {
					rev += words.charAt(j);
				}
				ans += rev + " ";
				rev = "";
			} else
				ans += str[i] + " ";
		}
		System.out.println(ans);
	}

}
