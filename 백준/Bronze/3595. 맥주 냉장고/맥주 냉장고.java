import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int A = 0;
		int B = 0;
		int C = 0;	
		int min = Integer.MAX_VALUE;
		
		for(int a = 1; a*a*a<=n; a++) {
			for(int b = a; a*b*b<=n; b++) {
				if(n % (a*b) == 0) {
					int c = n /(a*b);
					int answer = 2*(a*b + b*c + a*c);
					if(answer < min) {
						min = answer;
						A = a;
						B = b;
						C = c;
					}
				}
			}
		}
		System.out.print(A + " " + B + " " +  C);
	}
}