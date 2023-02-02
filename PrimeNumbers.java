package Numbers;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println("User entered number : " + num);

		if(num <= 1) {
			System.out.println("prime number stats from 2");
		}
		// let num = 19
		int i;
		for( i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime number");
				break;
			}
		}
		if(num == i) {
			System.out.println(num+"is a prime number");
		}
		
	}

}
