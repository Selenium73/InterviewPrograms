package InterviewPrograms;

public class $34WithOutLoop {

	static void withOutLoop(int n) {

		if(n<=100) {
			System.out.println(n);
			withOutLoop(n+1);
		}
	}

	public static void main(String[] args) {
		withOutLoop(1);
	}

}
