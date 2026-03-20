import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int N = sc.nextInt();
			long K = (long)N*N;
			System.out.println(K);
		}
	}
}