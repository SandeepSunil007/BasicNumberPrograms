package Numbers;
 // check number is palindrome or not and range of values
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number : ");
		int num1 = scan.nextInt(); // 121
//		System.out.println("Enter end number : ");
//		int num2 = scan.nextInt();
		// for(int i = num1; i <= num2; i++ ){
			int palindromNumber = palindromMethod(num1);
			if(palindromNumber == num1) {
				System.out.println(palindromNumber+ " is a palindrome number");
			}
			
		//}
		
		
	}

	public static int palindromMethod(int n) {
		int reminder;
		int reverse = 0;
		while(n > 0) {
			reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;
		}
		return reverse;
		
	}
}
