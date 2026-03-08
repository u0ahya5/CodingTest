import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int count;
		int answer;
		
		for(int i = 0; i<K; i++) {
			count = 0;
			answer = 0;
			String result = sc.next();
			String arr[] = result.split("");
			for(int j = 0; j<arr.length; j++) {
				if(arr[j].equals("O")) {
					count++;
					answer += count;
				} else {
					count = 0;
				}
			}
			System.out.println(answer);
		}
	}
}