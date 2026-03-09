import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int R = sc.nextInt();
		int count = 1;
		int answer = 0;
		
		while(true) {
			count *= 2;
			L = L * R / 100;
			if(L <= 5) break;
			answer += count * L;
		}
		System.out.print(answer);
	}
}