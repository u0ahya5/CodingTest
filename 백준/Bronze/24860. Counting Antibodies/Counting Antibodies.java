import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		long vk = sc.nextLong();
		long jk = sc.nextLong();
		long vy = sc.nextLong();
		long jy = sc.nextLong();
		long vh = sc.nextLong();
		long dh = sc.nextLong();
		long jh = sc.nextLong();
		
		long k = vk * jk;
		long y = vy * jy;
		long heavy = vh * dh * jh;
		
		System.out.print(heavy * (k+y));
	}
}