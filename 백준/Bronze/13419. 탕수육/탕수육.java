import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			String S = sc.next();
			boolean visited[] = new boolean[S.length()];
			int curr = 0;
			StringBuilder first = new StringBuilder();
			
			while(!visited[curr]) {
				visited[curr] = true;
				first.append(S.charAt(curr));
				curr = (curr + 2) % S.length();
			}
			
			curr = 1%S.length();
			visited = new boolean[S.length()];
			StringBuilder second = new StringBuilder();
			
			while(!visited[curr]) {
				visited[curr] = true;
				second.append(S.charAt(curr));
				curr = (curr + 2) % S.length();
			}
			
			System.out.println(first);
			System.out.println(second);
		}
	}
}