package Numbers;

import java.util.stream.IntStream;

public class rish {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(c->{
			int fact=1;
			for (int i = 1; i <=c ; i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		});
	}

}
