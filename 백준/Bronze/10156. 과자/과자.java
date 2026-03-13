import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M >= K*N) {
			System.out.println(0);
		} else {
			System.out.println(K*N - M);
		}
	}
}