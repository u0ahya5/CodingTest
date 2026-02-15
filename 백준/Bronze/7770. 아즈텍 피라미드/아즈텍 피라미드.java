import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nextLevel = 1;
		int i = 0;
		while(n>=nextLevel) {
			n -= nextLevel;
			i++;
			nextLevel += 4*i;
		}
		System.out.println(i);
	}
}