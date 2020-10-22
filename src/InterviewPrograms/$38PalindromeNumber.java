package InterviewPrograms;

import java.util.Scanner;

public class $38PalindromeNumber {

	// Method to reverse a number
	static int reverseNumber(int num) {
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num/=10;
		}
		return rev;
	}

	//Method to check for Palindrome
	static boolean isPalindrome(int num) {
		int revNum = reverseNumber(num);
		if(revNum == num)
			return true;
		else
			return false;
	}

	//Method to Reverse And Add given number until you get a Palindrome number
	static void reverseAndAdd(int number) {
		if(isPalindrome(number))
			System.out.println("Given "+number+" is already a palindrome number");
		else {
			while(!isPalindrome(number)) {
				int rev = reverseNumber(number);
				int sum = number+rev;
				System.out.println(number+" "+rev+"="+sum);
				number = sum;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = sc.nextInt();
		sc.close();

		reverseAndAdd(input);

	}

}
