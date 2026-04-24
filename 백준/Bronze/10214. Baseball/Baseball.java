import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int Y = 0;
			int K = 0;
			
			for(int j = 0; j<9; j++) {
				int Y_score = sc.nextInt();
				int K_score = sc.nextInt();
				
				Y += Y_score;
				K += K_score;
			}
			if(Y>K) {
				System.out.println("Yonsei");
			} else if(Y<K) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
		}
	}
}