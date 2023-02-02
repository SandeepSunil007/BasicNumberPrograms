package Numbers;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int num2 = scan.nextInt();
		for(int i = num1; i <= num2; i++) {
			int factValue = rangeFactorial(i);
			System.out.println(i + " factorial value : "+factValue);	
		}
	}
	public static int rangeFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;

	}
}
