import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int facN = 1;
		int facK = 1;
		int facNK = 1;
		
		for(int i = 1; i<=N-K; i++) {
			facNK *= i;
		}
		for(int i = 1; i<=N; i++) {
			facN *= i;
		}
		for(int i = 1; i<=K; i++) {
			facK *= i;
		}
		
		int answer = facN/(facK*facNK);
		System.out.println(answer);
	}
}