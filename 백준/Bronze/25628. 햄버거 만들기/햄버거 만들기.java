import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A/2 > B) {
			System.out.print(B);
		} else {
			System.out.print(A/2);
		}
	}
}