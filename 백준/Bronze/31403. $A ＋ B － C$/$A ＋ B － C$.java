import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println(A+B-C);
		String answer = String.valueOf(A) + String.valueOf(B);
		System.out.println(Integer.valueOf(answer) - C);
	}
}