import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt();
        
        int A = B - B/11;
        
        System.out.print(A);
	}
}