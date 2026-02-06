import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long factorial = 1;
		
		for (int i = 1; i<=N; i++) {
			factorial *= i;
		}
		
		long week = factorial / (7 * 24 * 60 * 60);
		System.out.print(week);
	}
}