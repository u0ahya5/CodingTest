import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean alphabet[] = new boolean[26];
			boolean ok = true;
			
			String line = sc.nextLine();
			
			if(line.equals("END")) break;
			
			
			for(int i = 0; i<line.length(); i++) {
				char c = line.charAt(i);
				
				if(c == ' ') continue;
				
				int idx = c - 'A';
				
				if(alphabet[idx] == true) {
					ok = false;
					break;
				}else {
					alphabet[idx] = true;
				}
			}
			if(ok) {
				System.out.println(line);
			}
		}
	}
}