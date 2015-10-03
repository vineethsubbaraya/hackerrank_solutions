import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		String five = "5";
		char three = '3';
		T = sc.nextInt();
		int N;

		for (int i = 0; i < T; i++) {
			N = sc.nextInt();

			StringBuilder str = new StringBuilder("");
			for (int j = 0; j < N; j++) {
				str.append(five);
			}

			int count5, count3;
			StringBuilder dec_num = null;
			int counter = str.length() - 1;
			for (int k = str.length(); k >= 0; k--) {
				count5 = 0;
				count3 = 0;

				for (int v = 0; v < str.length(); v++) {

					if (str.charAt(v) == '5') {
						count5++;
					} else {
						count3++;
					}
				}

				if (count5 % 3 == 0 && count3 % 5 == 0) {
					dec_num = str;
					break;
				}
				if(counter>=0) {
				str.setCharAt(counter, three);
				}
				counter--;

			}

			if (dec_num == null) {
				System.out.println("-1");
			} else {
				System.out.println(dec_num);
			}
		}
	}

}
