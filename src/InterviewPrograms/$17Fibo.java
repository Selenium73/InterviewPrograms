package InterviewPrograms;

import java.util.Scanner;

public class $17Fibo {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {

			System.out.println(a); //0
			c = a + b; //c = 0+1
			a = b; // a = 1
			b = c; // b = 1
		}
		
	}

}
