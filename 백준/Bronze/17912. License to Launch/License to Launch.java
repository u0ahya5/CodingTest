import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = sc.nextInt();
		int idx = 0;
		
		for(int i = 1; i<n; i++) {
			int day = sc.nextInt();
			if(min > day) {
				min = day;
				idx = i;
			}
		}
		System.out.print(idx);
	}
}