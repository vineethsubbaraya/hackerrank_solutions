import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		String str;
		Scanner s;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int T=Integer.parseInt(str);
		int count,a,b;
		
		for(int i=0;i<T;i++)
		{
			str = sc.nextLine();
			s = new Scanner(str).useDelimiter("\\s");
			count=0;
			int sqrt;
			a= (int) Math.ceil(Math.sqrt(s.nextInt())); 
			b= (int) Math.floor(Math.sqrt(s.nextInt()));
			count=b-a+1;
			System.out.println(count);
			
			
		}
	}

}
