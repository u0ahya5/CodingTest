import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		int count = 1;
		int sec = 0;
		
		while(N >= count) {
			N -= count;
			count++;
			sec++;
			
			if(N < count) {
				count = 1;
			}
		}
		System.out.print(sec);
	}
}