package Numbers;

import java.util.Scanner;

public class DoubtCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			boolean r = isAmstrong(i);
			if (r)
				System.out.println(i + " is Armstrong");
		}
	}

	static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	static boolean isAmstrong(int x) {
		int nd = countDigit(x);
		int t = x;
		int sum = 0;
		while (t > 0) {
			int r = t % 10;
			sum = sum + pow(r, nd);
			t = t / 10;
		}
		if (sum == x)
			return true;
		else
			return false;
	}
}
