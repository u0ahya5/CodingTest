import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int n = sc.nextInt();
			int if_5 = n / 5;
			int under_5 = n % 5;
			for(int j = 0; j<if_5; j++) {
				System.out.print("++++ ");
			}
			for(int j = 0; j<under_5; j++) {
				System.out.print("|");
			}
			System.out.println("");
		}
	}
}