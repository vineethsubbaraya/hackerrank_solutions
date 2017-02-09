import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void isPanagram(String s) {
		boolean result = checkPanagram(s);
		if(result) 
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
	}
	
	private boolean checkPanagram(String s) {
		if(s.length()<26)
			return false;
		
		String base = "abcdefghijklmnopqrstuvwxyz";
		for(char c: base.toCharArray()) {
			if(s.indexOf(c) <0){
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Solution sol = new Solution();
		sol.isPanagram(str.toLowerCase());
		
	}
}
