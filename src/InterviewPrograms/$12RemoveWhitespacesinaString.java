package InterviewPrograms;

public class $12RemoveWhitespacesinaString {

	public static void main(String[] args) {
		String str = "Praveen 				Kumar 								Sunkara";
		str = str.replaceAll("\\s+", " ");
		System.out.println(str);
		
	}

}
