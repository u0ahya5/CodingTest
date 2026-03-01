import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		M = M-45;
		
		if(M<0) {
			H -= 1;
			M += 60;
		}
		
		if(H < 0) {
			H = 23;
		}
		
		System.out.print(H + " " + M);
	}
}