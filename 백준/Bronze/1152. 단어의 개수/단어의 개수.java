import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.print(str.split(" ").length);
		}
	}
}