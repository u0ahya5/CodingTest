import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i<N; i++) {
			String xi = sc.next();
			String part[] = xi.split("-");
			int num = Integer.parseInt(part[1]);
			
			if(num <= 90) {
				count++;
			}
		}
		System.out.print(count);
	}
}