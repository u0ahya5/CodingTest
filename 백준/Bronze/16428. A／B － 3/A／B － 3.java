import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long C = A/B;
		long D = A%B;
		
		if(D < 0) {
			if(B > 0) {
				C--;
				D += B;
			} else {
				C++;
				D -= B;
			}
		}
		
		System.out.println(C);
		System.out.println(D);
	}
}