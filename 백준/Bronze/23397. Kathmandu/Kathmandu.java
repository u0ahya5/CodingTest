import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int D = sc.nextInt();
		int M = sc.nextInt();
		
		int c[] = new int[M];
		for(int i = 0; i<M; i++) {
			c[i] = sc.nextInt();
		}
		
		if(M==0) {
			if(D>=T) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			}
			return;
		}
		
		if(c[0] >= T) {
			System.out.println("Y");
			return;
		}
		
		for(int i = 0; i<M-1; i++) {
			if(c[i+1] - c[i] >= T) {
				System.out.print("Y");
				return;
			}
		}
		
		if(D - c[M-1] >= T) {
			System.out.println("Y");
			return;
		}
		
		System.out.println("N");
	}
}