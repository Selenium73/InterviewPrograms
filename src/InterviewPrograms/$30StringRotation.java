package InterviewPrograms;

public class $30StringRotation {

	public static void main(String[] args) {

		String s1 = "HelloWorldOfJava";
		String s2 = "WorldOfJavaHello";

		// 1.Check the same length or not
		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		}
		// 2.Add 2 strings
		String s3 = s1 + s1;
		System.out.println(s3);

		// 3.Check whether s3 contains s2 or not
		if (s3.contains(s2)) {
			System.out.println("s2 is rotated version of s1");
		} else
			System.out.println("s2 is not rotated version of s2");

	}

}
