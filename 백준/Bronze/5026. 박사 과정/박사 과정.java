import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String part[];
		
		for(int i = 0; i<N; i++) {
			String q = sc.next();
			if(q.equals("P=NP")){
				System.out.println("skipped");
			} else {
				part = q.split("\\+");
				
				int a = Integer.parseInt(part[0]);
				int b = Integer.parseInt(part[1]);
						
				System.out.println(a+b);
			}
		}
	}
}