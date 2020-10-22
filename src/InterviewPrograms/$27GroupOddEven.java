package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class $27GroupOddEven {

	public static void main(String[] args) {

		// Define the string
		String str = "I Am A Automation Engineer";

		// Spliting the array by using split function
		String[] split = str.split(" ");

		// Declare the arraylist
		List<String> evenstr = new ArrayList<String>();
		List<String> oddstr = new ArrayList<String>();

		for (int i = 0; i < split.length; i++) {

			if (i % 2 == 0) {
				System.out.println("*******" + evenstr.add(split[i]));
			} else
				System.out.println("-------------" + oddstr.add(split[i]));

		}
		for (int j = 0; j < evenstr.size(); j++) {
			String captialize = evenstr.get(j).charAt(0) + evenstr.get(j).substring(1) + " ";
			System.out.println(captialize);
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$");

		for (int k = 0; k < oddstr.size(); k++) {
			String captialize = oddstr.get(k).charAt(0) + oddstr.get(k).substring(1) + " ";
			System.out.println(captialize);
		}

	}

}
