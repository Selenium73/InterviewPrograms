package InterviewPrograms;

import java.util.Scanner;

public class _2ArmstrongNumber {

	public static void main(String[] args) {

		int num, number, total = 0, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		sc.close();
		number = num;
		while (number != 0) {
			temp = number % 10; // "%" will give remainder i.e., 37%10 = 7
			total = total + temp * temp * temp;
			number /= 10; // "/" will give quotient
		}
		if (total == num)
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
		
	}
}
