import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			int height = 1;
			for(int j=1;j<=N;j++)
			{
				if(j%2==0) {
					height+=1;
				} else {
					height*=2;
				}
			}
			System.out.println(height);
			
		}
	}

}
