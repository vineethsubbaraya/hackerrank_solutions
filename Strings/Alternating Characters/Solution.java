import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void altChars(String s) {
		int result = 0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i) == s.charAt(i+1)){
				result++;
			}
		}
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			sol.altChars(str);
		}

		
	}
}
