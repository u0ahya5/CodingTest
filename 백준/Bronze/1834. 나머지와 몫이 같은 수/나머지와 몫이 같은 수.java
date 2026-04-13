import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long answer = 0;
		
		for(int i = 0; i<N; i++) {
			answer += (N+1) * i;
		}
		System.out.println(answer);
	}
}