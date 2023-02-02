package Numbers;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		int startNum = scan.nextInt();
		System.out.println("Enter Range number : ");
		int endNum = scan.nextInt();
		
		 // 6 - division sum - 1 , 2 , 3 = 6
		for(int i = startNum; i <= endNum; i++) {
			if(isPerfect(i)){
				System.out.println(i + " is a perfect number");
			}
		}
		
		
	}
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
		
	}

}
