import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void marsExplore(String s) {
		StringBuilder str = new StringBuilder(s);
		char[] arr = {'S','O','S'};
		int result=0;
		for(int i=0;i<str.length()-2;i=i+3){
			s = str.substring(i, i+3);
			int j=0;
			for(char c: s.toCharArray()){
				if(c != arr[j]) {
					result++;
					
				}
				j++;
			}
		}
		System.out.println(result);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Solution sol = new Solution();
		sol.marsExplore(str);
		
	}
}
