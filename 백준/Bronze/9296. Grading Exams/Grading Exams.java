import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i = 1; i<=N; i++) {
			int L = sc.nextInt();
			String answer = sc.next();
			String student = sc.next();
			int count = 0;
			for(int j = 0; j<L; j++) {
				if(answer.charAt(j) != student.charAt(j)) {
					count++;
				}
			}
			System.out.println("Case " + i + ": " + count);
		}
	}
}