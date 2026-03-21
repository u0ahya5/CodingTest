import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<=N; i++) {
			int answer = 0;
			int temp = i;
			
			while(temp > 0) {
				answer += temp % 10;
				temp /= 10;
			}
			if(i % answer == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}