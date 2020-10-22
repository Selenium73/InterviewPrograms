package InterviewPrograms;

public class $41Largest_Smallest {
	
	static int largest(int a[],int total) {
		
		int temp;
		for(int i = 0;i<total;i++) {
			for(int j = i+1;j<total;j++) {
	//If we want to get the largest number then we have to use 'greaterthan(>)' and 'lessthan(<)' for smallest numbers
				if(a[i]>a[j]) { 
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}return a[total-1]; //For 2nd,3rd,.... largest (or) smallest number we have to use '2,3,....' instead of '1'
		
	}

	public static void main(String[] args) {
		
		int a[] = {12,43,87,36,26};
		System.out.println(largest(a,a.length));
		
	}

}
