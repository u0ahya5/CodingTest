import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		String arr[] = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
		
		for(int i = 0; i<P; i++) {
			String coin = sc.next();
			int count[] = new int[8];
			
			for(int j = 0; j<coin.length()-2; j++) {
				String str = coin.substring(j, j+3);
				
				for(int k = 0; k<8; k++) {
					if(str.equals(arr[k])) {
						count[k]++;
					}
				}
			}
			for(int k = 0; k<8; k++) {
				System.out.print(count[k] + " ");	
			}
			System.out.println();
		}
	}
}