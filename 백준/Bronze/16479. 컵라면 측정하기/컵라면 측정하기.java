import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		double K = sc.nextDouble();
		double D1 = sc.nextDouble();
		double D2 = sc.nextDouble();
		
		D1 /= 2;
		D2 /= 2;
		
		double answer = K*K - (D1-D2)*(D1-D2);
		System.out.println(answer);
	}
}