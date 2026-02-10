import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		for(int i = 1; i<=K; i++) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			
			int answer = 0;
			
			for(int j = 0; j<n; j++) {
				int di = sc.nextInt();
				int vi = sc.nextInt();
				
				if(di <= s*d) {
					answer += vi;
				}
			}
			System.out.println("Data Set " + i + ":");
			System.out.println(answer);
            System.out.println();
		}
	}
}