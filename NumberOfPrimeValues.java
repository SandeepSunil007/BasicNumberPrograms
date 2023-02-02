package Numbers;
import java.util.Scanner;
public class NumberOfPrimeValues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting number  : ");
		int startNum = scan.nextInt();
		System.out.println("Enter Ending number  : ");
		int endNum = scan.nextInt();
		int count = 0;
		int sum = 0;
		for(int i = startNum; i < endNum ; i++) {
			if(primeNumbers(i)) {
				System.out.println(i +"is a prime number");
				count++;
				sum+=i;
				
			}
		}
		System.out.println(startNum+ " to" + endNum+" numbers inbetween available count of prime numbers are : "+count);
		System.out.println(startNum+ " to" + endNum+" numbers inbetween available count of prime numbers sum is : "+sum);
		
		
		
	}
	
	public static boolean primeNumbers(int n) {
		int  i;
		for(i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}