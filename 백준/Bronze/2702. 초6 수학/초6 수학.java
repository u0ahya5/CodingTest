import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int gcd = 0;
		int lcm = 0;
		
		for(int i = 0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tempA = a;
			int tempB = b;
			
			while(true) {
				if(a%b == 0) {
					gcd = b;
					break;
				} else {
					int temp = a%b;
					a = b;
					b = temp;
				}
			}
			lcm = (tempA * tempB) / gcd;
			System.out.println(lcm + " " + gcd);
		}
	}
}