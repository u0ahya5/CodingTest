import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int T = sc.nextInt();
		
		int P = 10+2*(25-A+T);
		if(P < 0) {
			System.out.println(0);
		} else {
			System.out.println(P);
		}
	}
}