package InterviewPrograms;

public class $11NumberOfWordsinaString {

	public static void main(String[] args) {

		String str = "My name is Praveen";
		int count = 0;
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			count++;
		}
		System.out.println(count);
	}

}
