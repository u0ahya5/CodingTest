import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		if(ch == 'F')
		{
			System.out.println("Foundation");
		} else if(ch == 'C') {
			System.out.println("Claves");
		} else if(ch == 'V') {
			System.out.println("Veritas");
		} else {
			System.out.println("Exploration");
		}
	}
}