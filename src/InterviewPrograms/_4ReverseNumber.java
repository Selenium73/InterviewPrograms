package InterviewPrograms;

import java.util.Scanner;

public class _4ReverseNumber {

	public static void main(String[] args) {

		int num, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		sc.close();

		while (num >= 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of a number is:" + rev);

		
	}

}
