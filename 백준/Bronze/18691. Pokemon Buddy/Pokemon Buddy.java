import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int G = sc.nextInt();
			int C = sc.nextInt();
			int E = sc.nextInt();
			
			if(C>=E) {
				System.out.println(0);	
			} else {
				if(G==1) {
					System.out.println(E - C);
				} else if(G==2) {
					System.out.println((E - C) * 3);
				} else if(G==3) {
					System.out.println((E - C) * 5);
				}
			}
		}
	}
}