import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String n = sc.next();
		int result = 0;
		
		for(int i = 0; i<N; i++) {
			result += n.charAt(i) - '0';
		}
		System.out.print(result);
	}
}