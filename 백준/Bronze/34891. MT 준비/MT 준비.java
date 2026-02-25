import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if(N%M != 0) {
			System.out.println(N/M+1);
		} else {
			System.out.println(N/M);
		}
	}
}