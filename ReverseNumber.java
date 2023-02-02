package Numbers;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int num = scan.nextInt(); // 190
		int reminder; 
		int reverse = 0;
		while(num > 0) {
			reminder = num % 10;
			reverse = reverse*10+ reminder;
			num = num / 10;
		}
		System.out.println("the reverse numbers is : "+ reverse );
	}

}
