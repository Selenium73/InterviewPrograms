package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class $46Epam {

	public static String days(String s,int k) {
		List<String> day = new ArrayList<String>();
		day.add("Mon");
		day.add("Tue");
		day.add("Wed");
		day.add("Thu");
		day.add("Fri");
		day.add("Sat");
		day.add("Sun");
		
		int i = s.indexOf(s);
		
		return day.get((i+k)%7);
	}
	
	public static void main(String[] args) {

		System.out.println(days("Mon",3));

	}

}
