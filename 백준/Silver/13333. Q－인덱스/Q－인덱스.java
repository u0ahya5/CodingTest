import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		int arr[] = new int[n];

		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i = 0; i<n; i++) {
			if(arr[i] >= (n-i)) {
				answer = n - i;
				break;
			}
		}
		System.out.println(answer);
	}
}