import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int answer = 0;
			int N = sc.nextInt();
			for(int j = 0; j<N; j++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				
				if(A < 0 && B < 0 && C < 0) {
					answer += 0;
				} else if(A >= B && A >= C) {
					answer += A;
				} else if(B >= A && B >= C) {
					answer += B;
				} else if(C >= A && C >= B) {
					answer += C;
				}
			}
			System.out.println(answer);
		}
	}
}