import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		int max = 0;
		
		for(int i = 0; i<4; i++) {
			int off= sc.nextInt();
			int on = sc.nextInt();
			
			answer = answer - off + on;
			if(answer > max) {
				max = answer;
			}
		}
		System.out.print(max);
	}
}