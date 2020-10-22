package InterviewPrograms;

import java.util.Scanner;

public class $32NoOfDigits {

	public static void main(String[] args) {
		{
			int no, a = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number : ");
			no = sc.nextInt();
			sc.close();
			if (no < 0) {
				no = no * -1;
			} else if (no == 0) {
				no = 1;
			}
			while (no > 0) {
				no = no / 10;
				a++;
			}
			System.out.println("Number of Digits in given number is: " + a);
		}

	}

}
