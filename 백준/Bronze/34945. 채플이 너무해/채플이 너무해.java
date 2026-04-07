import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x >= 6) {
			System.out.println("Success!");
		} else {
			System.out.println("Oh My God!");
		}
	}
}