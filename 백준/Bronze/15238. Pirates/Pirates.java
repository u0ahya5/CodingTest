import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String word = sc.next();
		char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};
		int max = 0;
		int index = 0;
		int count[] = new int[26];
		
		for(int i = 0; i<T; i++) {
			char ch = word.charAt(i);
			
			for(int j = 0; j<alphabet.length; j++) {
				if(ch == alphabet[j]) {
					count[j]++;
				}
				
				if(count[j] > max) {
					max = count[j];
					index = j;
				}
			}
		}
		System.out.print(alphabet[index] + " " + max);
	}
}