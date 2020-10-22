package InterviewPrograms;

import java.util.stream.Stream;

public class $40StringUniques {

	public static void main(String[] args) {
		
		//1.By using stream functions
		Integer[] arr = new Integer[] {1,2,3,4,2};
		Stream.of(arr)
				.distinct().forEach(i -> System.out.print(" "+i));
		
		System.out.println("\n");
		
		//2.By using brute force O(n*n)
		int a[] = {1,2,3,4,2,1,2,3,4};
		int flag;
		for(int i = 0;i<a.length;i++) {
			flag = 0;
			for(int j = i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					flag = 1;
				}
			} if(flag == 0)
				System.out.println(a[i]);
		}
	}


}
