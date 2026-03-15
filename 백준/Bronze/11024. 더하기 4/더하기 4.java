import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<T; i++) {
			String n = sc.nextLine();
			String arr[] = n.split(" ");
			int answer = 0;
			
			for(int j = 0; j<arr.length; j++) {
				answer += Integer.parseInt(arr[j]);
			}
			
			System.out.println(answer);
		}
	}
}