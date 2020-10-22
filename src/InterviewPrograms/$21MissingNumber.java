package InterviewPrograms;

public class $21MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 6, 7 };
		int m, total, sum = 0;
		m = arr.length + 1;
		total = m * (m + 1) / 2;

		for (int num : arr) {
			sum += num;
		}

		System.out.println("Missing number in given array is:" + (total - sum));
	}

}
