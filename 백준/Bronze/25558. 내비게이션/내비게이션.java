import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int ex = sc.nextInt();
		int ey = sc.nextInt();
		
		long min = Long.MAX_VALUE;
		int answer = 0;
		
		for(int i = 1; i<=N; i++) {
			int prevX = sx;
			int prevY = sy;
			int M = sc.nextInt();
			long sum = 0;
			
			for(int j = 0; j<M; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				sum += Math.abs((long)prevX - x) + Math.abs((long)prevY - y);
				
				prevX = x;
				prevY = y;
			}
			sum += Math.abs((long)prevX - ex) + Math.abs((long)prevY - ey);
			
			if(sum < min) {
				min = sum;
				answer = i;
			}
		}
		System.out.println(answer);
	}
}