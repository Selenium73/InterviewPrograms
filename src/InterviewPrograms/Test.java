package InterviewPrograms;


import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws IOException{
		boolean status;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++){
			status = false;
			int a[] = new int[26];
			int b[] = new int[26];
			String str1 = bufferedReader.readLine();
			String str2 = bufferedReader.readLine();

			for(int j = 0;j<a.length;j++){
				a[(int) str1.charAt(j) - 97]++;
			} for(int j = 0;j<b.length;j++){
				b[(int) str2.charAt(j) - 97]++;
			} for(int j = 0;j<26;j++){
				if(a[j]>0 && b[j]>0){
					status = true;
					break;
				}
			} if(status)
				sb.append("YES");
			else
				sb.append("No");
			sb.append("\n");
			System.out.println(sb.toString());
		}

	}
}


