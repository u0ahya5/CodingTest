import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		int left_x = Math.min(x1, x3);
		int right_x = Math.max(x2, x4);
		int left_y = Math.min(y1, y3);
		int right_y = Math.max(y2, y4);
		
		int w = right_x - left_x;
		int h = right_y - left_y;
		int side = Math.max(w, h);
		
		System.out.print(side * side);
	}
}