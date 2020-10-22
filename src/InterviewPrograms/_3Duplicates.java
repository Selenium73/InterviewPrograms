package InterviewPrograms;

public class _3Duplicates {

	public static void main(String[] args) {

		String arr[] = { "Java", "CoreJava", "Java", "Spring", "Selenium", "Spring" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]==(arr[j])) {
					System.out.println("Duplicates are " + arr[i]);
				}
			}
		}
			

	}

}
