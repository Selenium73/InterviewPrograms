package InterviewPrograms;

public class $36ReverseWordByWord {

	public static void main(String[] args) {
		
		String[] str = "Praveen Sunkara".split("\\s");
		String rev = "";
		
		for(int i = str.length-1;i>=0;i--) {
			rev+=str[i]+" ";
		}System.out.println(rev);

	}

}
