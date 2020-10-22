package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $45Capgemini {

	static int linearSearch(int[] arr,int key) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		} return -1;
	}

	public static void main(String[] args) {

		//		// 1. To print the series 1,2,4,7,.....
		//		int num,add = 1;
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter a number:");
		//		num = sc.nextInt();
		//		sc.close();
		//		for(int i = 0;i<num;i++) {
		//			add += i;
		//			System.out.println(add);
		//		}

		//		// 2.Sorting order in ascending order
		//		List<String> list = new ArrayList<String>();
		//		list.add("Hyderabad");
		//		list.add("Bengaluru");
		//		list.add("Guntur");
		//		list.add("Kurnool");
		//		list.add("Vizag");
		//		list.add("Chennai");
		//		
		//		Collections.sort(list);
		//		System.out.println(list);
		//		
		//		//For desecnding order
		//		Collections.sort(list,Collections.reverseOrder());
		//		System.out.println(list);

		//		// 3.Nof words and spaces in agiven string
		//		String str = "      Praveen Kumar Sunkara      ".trim();
		//		int word = 1;
		//		for(int i = 0;i<str.length();++i) {
		//			if(str.charAt(i)==' ') {
		//				word++;
		//			}
		//		}System.out.println("No of words:"+word);
		//		System.out.println("No of spaces:"+(word-1));

		//4.Linear Search 
		int arr[] = {12,34,45,65,89};
		int key = 45;
		System.out.println(key+" is found at index:"+linearSearch(arr, key));
	}

}
