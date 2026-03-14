import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int v3 = sc.nextInt();
			
			System.out.println("Data set: " + v1 + " " + v2 + " " + v3);
			
			for(int j = 0; j<v3; j++) {
				if(v1 >= v2) {
					v1 /= 2;
				} else {
					v2 /= 2;
				}
			}
			
			if(v1 >= v2) {
				System.out.println(v1 + " " + v2);
			} else {
				System.out.println(v2 + " " + v1);
			}
			System.out.println();
		}
	}
}