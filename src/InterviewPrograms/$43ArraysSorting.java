package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $43ArraysSorting {

	public static void main(String[] args) {

//		List<String> al = new ArrayList<String>();
//
//		al.add("Hyderabad");
//		al.add("Chennai");
//		al.add("Bengaluru");
//		al.add("Kerala");
//		Object[] array = al.toArray();
//		
//		Collections.sort(al);
//		System.out.print("WithOut using enhanced for loop:"+al);
//		Collections.sort(al,Collections.reverseOrder());
//
//		System.out.println("\n"+al);
//
//		for(String str:al) {
//			System.out.print("\n"+str);
//		}
//
//		System.out.println("Without using inbuit()");
		
		int temp;
		int a[] = new int[] {98,57,245,643,76};
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} for(int k = 0;k<a.length;k++) {
			System.out.print(a[k]+"\t");
		}

	}

}
