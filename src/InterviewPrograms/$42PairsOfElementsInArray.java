package InterviewPrograms;

public class $42PairsOfElementsInArray {

	static void pairs(int inputArray[],int inputNumber) {
		
		for(int i = 0;i<inputArray.length;i++) {
			
			for(int j = i+1;j<inputArray.length;j++) {
				
				if(inputArray[i]+inputArray[j] == inputNumber)
					System.out.println(inputArray[i]+"  "+inputArray[j]+" = "+inputNumber);
			}
		}
		
	}
	public static void main(String[] args) {
		
		pairs(new int[] {4,6,15,-5,20,-10},10);

	}

}
