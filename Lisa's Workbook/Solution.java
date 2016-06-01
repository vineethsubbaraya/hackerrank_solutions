import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private int workBook(int[] t, int n, int k) {
		int spl=0,page=1;
		for(int i=0;i<n;i++) {
			int counter=1;
			for(int j=1;j<=t[i];j++) {
				if(counter > k) {
					page++;
					counter=1;
				}
				if(j==page) {
					spl++;
				}
				counter++;
			}
			page++;
		}
		
		return spl;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
		}
		Solution sol = new Solution();
		int result=sol.workBook(t, n, k);
		System.out.println(result);

	}

}
