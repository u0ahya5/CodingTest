import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		
		int t = (L + 4) / 5;
		System.out.print(t);
	}
}