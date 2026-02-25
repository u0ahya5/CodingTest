import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int D = sc.nextInt();
			int answer = A;
			
			for(int j = 1; j<N; j++) {
				A = A + D;
				answer += A;
			}
			System.out.println(answer);
		}
	}
}