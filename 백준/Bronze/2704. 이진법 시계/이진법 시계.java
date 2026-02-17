import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<N; i++) {
			String time = sc.nextLine();
			String save[] = time.split(":");
			int arr[] = {Integer.parseInt(save[0]), Integer.parseInt(save[1]), Integer.parseInt(save[2])};
			String binary_arr[] = new String[3];
			String row = "";
			String col = "";
			
			for(int j = 0; j<3; j++) {
				int temp = arr[j];
				String binary = "";
				
				while(temp>0) {
					int remain = temp % 2;
					binary = remain + binary;
					temp = temp / 2;
				}
				
				while(binary.length()<6){
				    binary = "0" + binary;
				}
				
				binary_arr[j] = binary;
				row += binary_arr[j];
			}
			for(int k = 0; k<6; k++) {
				col += binary_arr[0].charAt(k);
				col += binary_arr[1].charAt(k);
				col += binary_arr[2].charAt(k);
			}
			System.out.println(col + " " + row);
		}
	}
}