package Numbers;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a start number : ");
		int num = scan.nextInt();
		int sumOfFactorial = sumOfFactorial(num);
		if(sumOfFactorial == num) {
			System.out.println(num + " is a strong number");
		}else {
			System.out.println(num + " is not a strong number");
		}

	}
	
	public static int sumOfFactorial(int n) {
		int reminder;
		int sum = 0;
		while(n > 0) {
			reminder = n % 10;
			sum = sum + factorial(reminder);
			n = n / 10;
		}
		return sum;
		
	}
	public static int factorial(int n) {
		
		int fact = 1;
		for(int i =1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
