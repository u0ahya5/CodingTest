import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int S = sc.nextInt();
		
		System.out.print(R*8+S*3-28);
	}
}