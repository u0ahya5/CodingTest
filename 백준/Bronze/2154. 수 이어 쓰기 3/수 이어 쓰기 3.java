import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String N = sc.nextLine();
		
		for(int i = 1; i <= 100000; i++) {
			sb.append(i);
		}
		
		System.out.print(sb.indexOf(N) + 1);
	}
}