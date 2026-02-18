import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int K = sc.nextInt();
		int H = sc.nextInt();
		int club[] = {S, K, H};
		int min = club[0];
		
		if(S+K+H >= 100) {
			System.out.println("OK");
		} else {
			for(int i = 0; i<3; i++) {
				if(min > club[i]) {
					min = club[i];
				}
			}
			if(min == S) {
				System.out.print("Soongsil");
			} else if(min == K) {
				System.out.print("Korea");
			} else {
				System.out.print("Hanyang");
			}
		}
	}
}