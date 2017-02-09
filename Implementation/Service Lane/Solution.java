import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		String str;
		int n,t,a,b,width;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		Scanner s = new Scanner(str).useDelimiter("\\s");
		n = s.nextInt();
		t=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<t;j++) {
			a=sc.nextInt();
			b=sc.nextInt();
			width = arr[a];
			for(int k=a+1; k<=b; k++) {
				if(width == 1) {
					break;
				} 
				else if(arr[k] < width) {
					width = arr[k];
				}
			}
			System.out.println(width);
		}
	}

}
