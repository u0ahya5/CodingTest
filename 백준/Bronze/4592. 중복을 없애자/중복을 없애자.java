import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			
			int cur = 0;
			for(int i = 0; i<N; i++) {
				int num = sc.nextInt();
				if(cur != num) {
					System.out.print(num + " ");
				}
				cur = num;
			}
			System.out.println("$");
		}
	}
}