package InterviewPrograms;

import java.util.ArrayList;

public class $31CountNumber {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		String temp = "";
		String str = "ABCDE145FGHIJ145jlijlk589";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit((str.charAt(i)))) {
				temp += str.charAt(i);

				if (i == str.length() - 1) {
					al.add(Integer.valueOf(temp));
					temp = "";
					break;
				}
			} else if (Character.isAlphabetic(str.charAt(i)) && !("".equals(temp))) {
				al.add(Integer.valueOf(temp));
				temp = "";
			}

		}
		int sum = 0;
		for (int val : al) {
			sum += val;
		}
		System.out.println(sum);

	}

}
