import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
	
		int s = (int)Math.sqrt(2 * W);
		int p = s * 4;
		
		System.out.println(p);
	}
}