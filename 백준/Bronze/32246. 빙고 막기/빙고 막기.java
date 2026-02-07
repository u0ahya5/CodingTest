import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
        if(N == 2) {
			System.out.print(3);
		} else {
			System.out.print(N);
		}
	}
}