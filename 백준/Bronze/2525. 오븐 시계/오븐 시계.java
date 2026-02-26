import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		B = B+C;
		A += B/60;
		B = B%60;
		A = A%24;
				
		System.out.print(A);
		System.out.print(" " + B);
	}
}