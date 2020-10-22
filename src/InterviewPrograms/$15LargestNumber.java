package InterviewPrograms;

public class $15LargestNumber {


	public static void main(String[] args) {

		int arr[] = {1,45,32,56,87,40};
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}   System.out.println("Largest number in the given array is:"+max);
	}
}
