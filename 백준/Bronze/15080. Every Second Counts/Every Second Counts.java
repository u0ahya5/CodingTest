import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String start_time = sc.nextLine();
		String end_time = sc.nextLine();
		
		String t1[] = start_time.split(" : ");
		String t2[] = end_time.split(" : ");
		
		int t1_h = Integer.parseInt(t1[0]) * 3600;
		int t1_m = Integer.parseInt(t1[1]) * 60;
		int t1_result = t1_h + t1_m + Integer.parseInt(t1[2]);
		
		int t2_h = Integer.parseInt(t2[0]) * 3600;
		int t2_m = Integer.parseInt(t2[1]) * 60;
		int t2_result = t2_h + t2_m + Integer.parseInt(t2[2]);
		
		if(t1_result > t2_result) {
			System.out.print(t2_result - t1_result + 3600 * 24);
		} else {
			System.out.print(t2_result - t1_result);
		}
	}
}