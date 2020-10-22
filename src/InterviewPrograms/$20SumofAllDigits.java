package InterviewPrograms;

import java.util.Scanner;

public class $20SumofAllDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = 0;
		sc.close();
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of a given number is:" + sum);
		
	}

}
