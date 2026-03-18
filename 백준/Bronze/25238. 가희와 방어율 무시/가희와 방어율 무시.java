import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double damage = a - (a*(b/100));
		
		if(damage >= 100) {
			System.out.print(0);
		} else {
			System.out.print(1);
		}
	}
}