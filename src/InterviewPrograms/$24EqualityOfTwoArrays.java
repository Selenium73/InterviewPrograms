package InterviewPrograms;

public class $24EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] a1 = { 2, 6, 9, 5, 8 };
		int[] a2 = { 2, 6, 9, 5, 8 };

		boolean status = true;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else
			status = false;

		if (status)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");

	}

}
