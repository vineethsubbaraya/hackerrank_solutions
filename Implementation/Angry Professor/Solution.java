import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		String s;
		s=sc.nextLine();
		t=Integer.parseInt(s);
		int[] n = new int[t];
		int[] k = new int[t];
		
		for(int i=0;i<t;i++ ) {
			s = sc.nextLine();
			String[] input = s.split("\\s+");
			n[i] = Integer.parseInt(input[0]);
			k[i] = Integer.parseInt(input[1]);
			s=sc.nextLine();
			input = s.split("\\s+");
			int count=0;
			for(int j=0;j<input.length;j++) {
				if(Integer.parseInt(input[j]) <= 0) {
					count++;
				}
			}
			if(count>=k[i]) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
				
		}
		
		

	}

}
