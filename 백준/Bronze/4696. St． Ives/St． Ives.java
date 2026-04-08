import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			double N = sc.nextDouble();
			double answer = 1;
			
			if(N == 0) break;
			
			for(int i = 1; i<=4; i++) {
				answer += Math.pow(N, i);
			}
			System.out.printf("%.2f\n", answer);
		}
	}
}