import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String words[] = new String[N];
		
		for(int i = 0; i<N; i++) {
			words[i] = sc.next();
			System.out.print(words[i]+"DORO ");
		}
	}
}