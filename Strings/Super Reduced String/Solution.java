import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void superReduced(String s) {
		StringBuilder str = new StringBuilder(s);
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				str.delete(i, i+2);
				if(i==0)
					i--;
				else
					i = i-2;
			}
			
		}
		if(str.length()>0) {
			System.out.println(str);
		}else {
			System.out.println("Empty String");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Solution sol = new Solution();
		sol.superReduced(str);
		
	}
}
