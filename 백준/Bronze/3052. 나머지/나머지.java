import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean use[] = new boolean[42];
		
		for(int i = 0; i<10; i++) {
			int num = sc.nextInt();
			
			if(!use[num%42]) {
				use[num%42] = true;
				count++;
			}
		}
		System.out.print(count);
	}
}