import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			int t = 10;
			
			while(x >= t) {
				if(x % t >= t / 2) {
					x += t;
					x -= x%t;
				} else{
					x -= x%t;
				}
				t *= 10;
			}
			System.out.println(x);
		}
	}
}