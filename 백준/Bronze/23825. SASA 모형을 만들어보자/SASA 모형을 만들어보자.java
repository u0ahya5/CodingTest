import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int answer = 0;
		
		N = N/2;
		M = M/2;
		
		if(N > M) {
			answer = M;
		} else {
			answer = N;
		}
		System.out.print(answer);
	}
}