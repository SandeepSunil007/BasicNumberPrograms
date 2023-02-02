package Numbers;

import java.util.Scanner;

public class Fibbinonce {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/* The given number is fibinonci or not */

//		System.out.println("Enter a number : ");
//		int num = scan.nextInt(); // 7
//		int first = 6, second = 5, third = 0;
//		third = first + second;
//		System.out.println("Third variable data : "+ third);
//		if(num == third) {
//			System.out.println(num+ " is a fabbinoncci number");
//		}else {
//			System.out.println(num+" is not a fibbonancci number");
//		}

		/* Range of Fibbinoncci */
		
		System.out.println("Enter a starting number : ");
		int start = scan.nextInt();
		System.out.println("Enter a range number : ");
		int range = scan.nextInt();
		
//		int a = start -2;
//		int b = start - 1;
//		if(start == 1) {
//			a = 0;
//			System.out.println("a value is "+ a);
//			b = 1;
//			System.out.println("b value is "+ b);
//		}
		
		//if we 
		int a = 0;
		int b = 1;
		int storeValue = 0;
		
		for(int i = start; i <= range; i++) {
			storeValue = a + b;
			if(storeValue <= range) {
				System.out.println(storeValue);
				a = b;
				b = storeValue;
			}
		}
	}

}
