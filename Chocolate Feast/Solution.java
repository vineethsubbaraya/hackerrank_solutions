import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	private void chocFeast(int amt, int cost, int wrap) {
		int q,rem,temp=0,q1,val;
		q = amt/cost;
		val=q;
		temp=temp+q;
		while(val != 0) {
			rem = q%wrap;
			q = q/wrap;
			temp=temp+q;
			q=q+rem;
			val=q/wrap;
			
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amt,cost,wrap;
		Solution sol = new Solution();
		for(int i=0;i<=n;i++) {
			amt=sc.nextInt();
			cost = sc.nextInt();
			wrap = sc.nextInt();
			sol.chocFeast(amt, cost, wrap);
		}
	}

}
