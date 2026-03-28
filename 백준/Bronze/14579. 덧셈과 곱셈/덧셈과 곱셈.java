import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		long answer = 1;
		
		for(int i = a; i<=b; i++) {
			int sum = i*(i+1) /2;
			answer = (answer * sum) % 14579;
		}
        System.out.println(answer);
	}
}