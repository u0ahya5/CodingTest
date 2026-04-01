import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B && A!=C) {
			System.out.print("C");
		} else if(A==C && A!=B) {
			System.out.print("B");
		} else if(B==C && B!=A) {
			System.out.print("A");
		} else {
			System.out.print("*");
		}
	}
}