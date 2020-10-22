package InterviewPrograms;

public class $33DuplictaeWordsInAString {

	public static void main(String[] args) {

		String str = "Test Manager Test Engineer Test Lead".toLowerCase();
		int count;

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = " ";
				}
			}

			if (count > 1 && words[i] != " ")
				System.out.println("Duplicate word in a given string is:" + words[i]+" and Count of a repeated word is:"+count);
		}
	}
}
