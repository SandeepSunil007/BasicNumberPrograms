package Numbers;

import java.util.Scanner;

public class PrimePalindromeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt(); // 198

		int chackeValue = palindrome(num);
		if (chackeValue == num) {
			int prime = isPrime(num);
			if (prime % num == 0) {
				System.out.println(num + "is a primePalindrome number");
			} else {
				System.out.println(num + " is not a primePalindrome number");
			}
		}
		
	}

	private static int isPrime(int num) {
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number");
				break;
			}
		}
		return i;
	}

	private static int palindrome(int num) {

		int reminder;
		int reverse = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		return reverse;
	}

}
