package Numbers;

public class SwapNumberWith3rdVariable {
	public static void main(String[] args) {
		int i = 30; 
		int j = 20;
		int k;
		
		k = i + j;
		System.out.println("k :"+k); 
		i = k - i;
		j = k - j;
		System.out.println("new i : "+i );
		System.out.println("new j :"+ j);
	}

}
