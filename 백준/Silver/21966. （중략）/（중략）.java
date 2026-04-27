import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		if(S.length() > 25) {
			String head = S.substring(0, 11);
			String tail = S.substring(N-11);
			int start = 11;
			int end = N-12;
			boolean same = false;
			char ch;
			
			for(int i = start; i<N; i++) {
				if(S.charAt(i) == '.') {
					if(end <= i) {
						same = true;
					}
					break;
				}
			}
			if(same) {
				System.out.println(head + "..." + tail);
			} else {
				System.out.println(S.substring(0, 9) + "......" + S.substring(N-10));
			}
		} else {
			System.out.println(S);
		}
	}
}