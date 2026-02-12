import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String emoji = sc.nextLine();
		int underbar = 0;
		
		for(int i = 0; i<emoji.length(); i++) {
			if(emoji.charAt(i) == '_') {
				underbar++;
			}
		}
		System.out.print(emoji.length() + 2 + underbar * 5);
	}
}