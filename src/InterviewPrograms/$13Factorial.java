package InterviewPrograms;

import java.util.Scanner;

public class $13Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sc.close();
		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a given number " + n + " is:" + fact);			

	}

}
