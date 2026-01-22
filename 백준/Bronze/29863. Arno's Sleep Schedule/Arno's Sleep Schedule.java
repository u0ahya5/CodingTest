import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int sleepTime = sc.nextInt();
		int wakeupTime = sc.nextInt();
		
		if(sleepTime >= 20 && sleepTime <= 23) {
			System.out.println(24 - sleepTime + wakeupTime);
		} else {			
			System.out.println(wakeupTime - sleepTime);
		}
	}
}