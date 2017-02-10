import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void camelCase(String s) {
		int result = 0;
		for(char c: s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result++;
			}
		}
		System.out.println(result+1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Solution sol = new Solution();
		sol.camelCase(str);
		
	}
}
