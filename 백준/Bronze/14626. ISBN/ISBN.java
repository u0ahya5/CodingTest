import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String ISBN = sc.nextLine();
		String arr[] = ISBN.split("");
		int arr1[] = new int[arr.length];
		int index = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("*")) {
				index = i;
				arr1[i] = 0;
			} else {
				arr1[i] = Integer.parseInt(arr[i]);
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i<12; i++) {
			if(i % 2 != 0) {
				sum += arr1[i] * 3;
			} else {
				sum += arr1[i];
			}
		}
		
		for(int i = 0; i<10; i++) {
			int temp = sum;
			
			if(index % 2 == 0) {
				temp += i;
			} else {
				temp += i*3;
			}
			
			if((temp + arr1[12]) % 10 == 0) {
				System.out.println(i);
			}
		}
	}
}