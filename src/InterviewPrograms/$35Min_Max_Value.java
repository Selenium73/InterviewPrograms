package InterviewPrograms;

public class $35Min_Max_Value {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int minValue = 0,maxValue = 0;
		
		for(int i = 0;i<4;i++) {
			minValue+= arr[i];
			maxValue+= arr[arr.length-i-1];
		}System.out.println(minValue+"      "+maxValue);
		
	}

}