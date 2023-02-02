package Numbers;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a first Number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter a second Number : ");
		int secondNubmer = scan.nextInt();
		
		for(int i = firstNumber; i <= secondNubmer; i++) {
			int amstrong = isAmstrong(i);
			if(amstrong == i) {
				System.out.println(i+" is a amstrong number==========================================");
			}
		}
		
		// Number is amstrong Or Not
		
//		System.out.println("Enter a number : ");
//		int num = scan.nextInt(); // 153 -> 1*3 + 5*3 + 3*3 = 153
//		int amstrong = isAmstrong(num);
//		if (amstrong == num) {
//			System.out.println(num + " is a amstrong number");
//		} else {
//			System.out.println(num + " is not a amstrong");
//		}

	}

	// count of letters present into user number
	public static int myCount(int m) {
		int count = 0;
		while (m > 0) {
			count++;
			m = m / 10;
		}
		return count;
	}

	public static int isAmstrong(int n) {

		int myCount = myCount(n);
//		System.out.println("user entered number count  : " + myCount);

		int reminder;
		int sum = 0;
		while (n > 0) {
			reminder = n % 10;
//			System.out.println("reminder : " + reminder);
			
			sum = sum + sumOfAmstrong(reminder, myCount);
//			System.out.println("sum : " + sum);
			
			n = n / 10;
		}
		return sum;
	}

	private static int sumOfAmstrong(int reminder, int myCount) {
       int multiple = 1;
       while(myCount > 0) {
    	   multiple = multiple * reminder;
//    	   System.out.println("multiple :" + multiple);
    	   myCount--;
//    	   System.out.println("mycount decrease : "+ myCount);
    			   
       }
		return multiple;
	}
}
