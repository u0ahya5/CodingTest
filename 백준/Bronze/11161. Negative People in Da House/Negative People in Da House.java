import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int M = sc.nextInt();
			int curr = 0;
			int need = 0;
			
			for(int j = 0; j<M; j++) {
				int P1 = sc.nextInt();
				int P2 = sc.nextInt();
				
				curr += P1;
				curr -= P2;
				
				if(curr < 0) {
					need -= curr;
					curr = 0;
				}
			}
			System.out.println(need);
		}
	}
}