package InterviewPrograms;

import java.util.Scanner;

public class $39FloydsTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int row = sc.nextInt();
		sc.close();
		
		int value = 1;
		
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(value+"\t");
				value++;
			}System.out.println();
		}

	}

}
