import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 1) {
			System.out.println(11);
			System.out.println("A B C D E F G H J L M");
		} else if(N == 2) {
			System.out.println(9);
			System.out.println("A C E F G H I L M");
		} else if(N == 3) {
			System.out.println(9);
			System.out.println("A C E F G H I L M");
		} else if(N == 4) {
			System.out.println(9);
			System.out.println("A B C E F G H L M");
		} else if(N == 5) {
			System.out.println(8);
			System.out.println("A C E F G H L M");
		} else if(N == 6) {
			System.out.println(8);
			System.out.println("A C E F G H L M");
		} else if(N == 7) {
			System.out.println(8);
			System.out.println("A C E F G H L M");
		} else if(N == 8) {
			System.out.println(8);
			System.out.println("A C E F G H L M");
		} else if(N == 9) {
			System.out.println(8);
			System.out.println("A C E F G H L M");
		} else {
			System.out.println(8);
			System.out.println("A B C F G H L M");
		}
	}
}