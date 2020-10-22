package InterviewPrograms;

public class $18PrimeNumber {

	public static void main(String[] args) {

		for (int i = 0; i <= 1100000; i++) {
			int k = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k = k + 1;
				}
			}
			if (k == 2) {
				System.out.println(i);
			}
		}
		
	}

}
