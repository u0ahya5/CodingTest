import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int shot = 0;
		
		if(A%2==0) {
			shot++;
			A++;
		}
		
		shot += (B-A+2)/2;
		System.out.print(shot);
	}
}