package InterviewPrograms;

import java.util.Scanner;

public class $23PyramidStars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows you want to print:");
		int n = sc.nextInt();
		int r = 1;
		sc.close();

		for (int i = n; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= r; j++) {
				System.out.print("* ");
			}
			System.out.println();
			r++;
		}

	}

}
