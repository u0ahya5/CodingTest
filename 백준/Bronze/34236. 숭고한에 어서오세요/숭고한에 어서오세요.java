import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		int year = 0;
		
		for(int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
			year = A[N-1] + A[1] - A[0];
		}
		System.out.print(year);
	}
}