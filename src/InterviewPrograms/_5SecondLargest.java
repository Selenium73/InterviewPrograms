package InterviewPrograms;

public class _5SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 1, 55, 669, 1457, 2556, 999 };
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond Largest number is :" + secondLargest);
			
		
	}

}
