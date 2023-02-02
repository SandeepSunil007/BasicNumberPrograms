package Numbers;

import java.util.Scanner;

public class PrimeNumberWithMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = scan.nextInt();
		System.out.println("user entered number is : " + num);
		PrimeNumberWithMethod ref = new PrimeNumberWithMethod();
		ref.checkPrime(num);
		// with static variable, no need create object, directly we can call
	}

	public /*static*/  int checkPrime(int n) {
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not a prime number");
				break;
			}
		}
		if (n == i) {
			System.out.println(n + " is a prime number");
		}
		return n;

	}
}
