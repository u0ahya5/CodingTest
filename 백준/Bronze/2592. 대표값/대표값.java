import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int avg = 0;
		int arr[] = new int[100];
		for(int i = 0; i<10; i++) {
			int n = sc.nextInt();
			avg += n;
			arr[n / 10]++;
		}
		
		int max = 0;
		int mode = 0;
		
		for(int i = 0; i<100; i++) {
			if(arr[i] > max) {
				max = arr[i];
				mode = i*10;
			}
		}
		
		System.out.println(avg / 10);
		System.out.println(mode);
	}
}