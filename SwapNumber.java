package Numbers;

// swap numbers without using any other variable

public class SwapNumber {
	public static void main(String[] args) {
		int i = 20;
		int j = 30;
		System.out.println("i :" + i); // 30
		System.out.println("j :" + j); // 20
		i = i + j;
		System.out.println("new i : " + i);
		j = i - j;
		System.out.println("new j :"+ j);
		i = i - j;
		System.out.println("new new i : "+ i);
	}

}
