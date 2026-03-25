import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int ABCD[] = new int[4];
		for(int i = 0; i<4; i++) {
			ABCD[i] = sc.nextInt();
		}
		int E = sc.nextInt();
		int F = sc.nextInt();
		int sum = 0;
		
		int min = ABCD[0];
		for(int i = 0; i<4; i++) {
			sum += ABCD[i];
			if(min > ABCD[i]) {
				min = ABCD[i];
			}
		}
		sum -= min;
		
		if(E > F) {
			sum += E;
		} else {
			sum += F;
		}
		
		System.out.print(sum);
	}
}