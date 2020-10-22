package InterviewPrograms;

import java.util.Scanner;

public class $28AreaOfCircle {

	public static void main(String[] args) {

		int radius = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle:");
		radius = sc.nextInt();
		sc.close();

		double area = Math.PI * radius * radius;
		System.out.println("Area of circle is:" + area);

	}
}
