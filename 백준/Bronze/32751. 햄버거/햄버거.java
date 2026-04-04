import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		
		int countA = 0; int countB = 0; int countC = 0; int countD = 0;
		
		if(S.charAt(0) != 'a' || S.charAt(N-1) != 'a') {
			System.out.println("No");
			return;
		}
		
		for(int i = 0; i<N; i++) {
			char ch = S.charAt(i);
			
			if(ch == 'a') {
				countA++;
			} else if(ch == 'b') {
				countB++;
			} else if(ch == 'c') {
				countC++;
			} else {
				countD++;
			}
			
			if(i > 0 && S.charAt(i) == S.charAt(i-1)) {
				System.out.println("No");
				return;
			}
		}
		
		if(countA > A || countB > B || countC > C  || countD > D) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}