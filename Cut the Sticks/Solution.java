import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int n;

	private void cutSticks(int[] arr) {
		int count = arr.length;
		int position = 0;
		int sub;
		while (count > 0) {
			System.out.println(count);
			sub = arr[position];
			for (int i = 0; i <= arr.length - 1; i++) {
				if ((arr[i] - sub) == 0) {
					position++;
					count--;
				}
			}
		}
	}

	private int[] mergeSort(int[] arr, int left, int right) {
		int center;
		if (left < right) {
			center = (left + right) / 2;
			mergeSort(arr, left, center);
			mergeSort(arr, center + 1, right);
			merge(arr, left, center, right);

		}
		return arr;
	}

	private void merge(int[] arr, int left, int center, int right) {

		int i = left;
		int j = center + 1;
		int k = left;
		int[] tmp = new int[n];

		while (i <= center && j <= right) {
			if (arr[i] <= arr[j]) {
				tmp[k++] = arr[i++];
			} else {
				tmp[k++] = arr[j++];
			}
		}
		while (i <= center) {
			tmp[k++] = arr[i++];
		}
		while (j <= right) {
			tmp[k++] = arr[j++];
		}
		for (int x = left; x <= right; x++) {
			arr[x] = tmp[x];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Solution sol = new Solution();
		arr = sol.mergeSort(arr, 0, arr.length - 1);
		sol.cutSticks(arr);
	}

}
