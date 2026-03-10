import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int alphabet[] = new int[26];
		String S = sc.nextLine();
		String arr[] = S.split("");
		
		for(int i = 0; i<26; i++) {
			alphabet[i] = -1;
		}
		
		for(int i = 0; i<S.length(); i++) {
			int idx = arr[i].charAt(0) - 'a';
			if(alphabet[idx] == -1) {
				alphabet[idx] = i;
			}
		}
		
		for(int i = 0; i<26; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}