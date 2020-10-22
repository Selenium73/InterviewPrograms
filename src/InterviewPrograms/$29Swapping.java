package InterviewPrograms;

public class $29Swapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swaping:" + a + " and " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swaping :" + a + " and " + b);
		
		//For String
		String str1 = "Praveen";
		String str2 = "Sunkara";
		
		System.out.println("Before Swapping:"+str1+" "+str2);
			 str1 = str1 + str2; //PraveenSunkara -- 14
		
			 str2 = str1.substring(0,str1.length() - str2.length()); //PraveenSunkara(14) - Sunkara(7) = Praveen
			 str1 = str1.substring(str2.length()); //Sunkara (7) will store in str1
		System.out.println("After Swapping:"+str1+" "+str2);

	}

}
