import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<T; i++) {
			String N = sc.nextLine();
			int n = Integer.parseInt(N.substring(N.length() - 2));
			
			if((Integer.parseInt(N)+1) % n == 0) {
				System.out.println("Good");
			} else {
				System.out.println("Bye");
			}
		}
	}
}