import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int min_Inf = sc.nextInt();
		int min_Math = sc.nextInt();
		int min_Sci = sc.nextInt();
		int min_Eng = sc.nextInt();
		
		int man_Inf = sc.nextInt();
		int man_Math = sc.nextInt();
		int man_Sci = sc.nextInt();
		int man_Eng = sc.nextInt();
		
		int S = min_Inf + min_Math + min_Sci + min_Eng;
		int T = man_Inf + man_Math + man_Sci + man_Eng;
		
		if(S > T) {
			System.out.print(S);
		} else if(S < T) {
			System.out.print(T);
		} else if(S == T) {
			System.out.print(S);
		}
	}
}