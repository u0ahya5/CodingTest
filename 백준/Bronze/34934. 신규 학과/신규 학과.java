import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		int year = 0;
		String answer = "";
		
		for(int i = 0; i<N; i++) {
			String major = sc.nextLine();
			String list[] = major.split(" ");
			String name = list[0];
			int current_year = Integer.parseInt(list[1]);
			
			if(year < current_year) {
				year = current_year;
				answer = name;
			}
		}
		System.out.print(answer);
	}
}