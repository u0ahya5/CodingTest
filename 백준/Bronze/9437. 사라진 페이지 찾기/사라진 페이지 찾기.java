import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pages[] = new int[3];
		
		while(true) {
			int N = sc.nextInt();
			if(N == 0) {
				break;
			}
			int P = sc.nextInt();
			if(P % 2 == 0) {
				pages[0] = P-1;
				pages[1] = N - (P-1);
				pages[2] = N - (P-2);
			}
			else {
				pages[0] = P+1;
				pages[1] = N - P;
				pages[2] = N - (P-1);
			}
			Arrays.sort(pages);
			
			System.out.println(pages[0] + " " + pages[1] + " " + pages[2]);
		}
	}
}