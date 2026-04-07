import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int answer = -1;
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x = 0; x<=N; x++) {
			int count = 0;
			
			for(int i = 0; i<N; i++) {
				if(arr[i] == x) count++;
			}
			
			if(count == x) {
				answer = Math.max(answer, x);
			}
		}
		System.out.print(answer);
	}
}