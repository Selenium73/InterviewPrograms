package InterviewPrograms;

import java.util.Scanner;

public class $37TwoStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n>0) {
			String str1 = sc.next();
			String str2 = sc.next();
			boolean[] status = new boolean[26];

			for(char c:str1.toCharArray()) {
				status[c - 'a'] = true;
			} for(char c:str2.toCharArray()) {
				if(status[c - 'a']) {
					System.out.println("YES");
					continue;
				}
			} System.out.println("NO");
		}sc.close();

	}

}

//boolean status; 
//FileInputStream fis = new FileInputStream(""); 
//BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in)); 
//int n = Integer.parseInt(bufferedreader.readLine()); 
//StringBuilder sb = new StringBuilder(); 
//for(int i = 0;i<n;i++) { 
//	status = false; 
//	int a[] = new int[26]; 
//	int b[] = new int[26]; 
//	String str1 = bufferedreader.readLine(); 
//	String str2 = bufferedreader.readLine(); 
//	for(int j = 0;j<a.length;j++) { 
//		a[(int) str1.charAt(j) - 97]++; 
//	} 
//	for(int j = 0;j<b.length;j++){ 
//		b[(int) str2.charAt(j) - 97]++; 
//	} 
//	for(int j = 0;j<26;j++){ 
//		if(a[j]>0 && b[j]>0){ 
//			status = true; 
//			break; 
//		} 
//	} 
//	if(status) 
//		sb.append("yes"); 
//	else sb.append("no"); 
//	sb.append("\n"); 
//	System.out.println(sb.toString()); 
