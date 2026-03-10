import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		
		for(int c = 0; c<=n+m; c++) {
			for(int x = 0; x<=n; x++) {
				int y = c - x;
				
				if(0 <= y && y <= m) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}