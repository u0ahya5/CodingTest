import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String jinho = sc.nextLine();
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i<N; i++) {
			String mbti = sc.next();
			
			if(mbti.equals(jinho)) {
				count++;
			}
		}
		System.out.print(count);
	}
}