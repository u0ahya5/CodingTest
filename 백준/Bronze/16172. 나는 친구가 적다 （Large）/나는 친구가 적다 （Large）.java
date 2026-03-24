import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String K = sc.nextLine();
		int pi[] = new int[K.length()];
		
		int j = 0;
		for(int i = 1; i<K.length(); i++) {
			while(j > 0 && K.charAt(i) != K.charAt(j)) {
				j = pi[j-1];
			}
			if(K.charAt(i)==K.charAt((j))) {
				j++;
				pi[i] = j;
			}
		}
		
		j = 0;
		for(int i = 0; i<S.length(); i++) {
			char c = S.charAt(i);
			if(c>='0'&&c<='9') continue;
			while(j > 0 && c != K.charAt(j)) {
				j = pi[j-1];
			}
			
			if(c == K.charAt(j)) {
				j++;
			}
			
			if(j == K.length()) {
				System.out.print(1);
				return;
			}
		}
		System.out.println(0);
	}
}