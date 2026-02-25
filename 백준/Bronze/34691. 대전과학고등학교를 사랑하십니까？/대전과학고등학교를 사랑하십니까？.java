import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(true) {
			str = sc.nextLine();
			
			if(str.equals("end")) {
				break;
			}
			
			if(str.equals("animal")) {
				System.out.println("Panthera tigris");
			} else if(str.equals("flower")) {
				System.out.println("Forsythia koreana");
			} else {
				System.out.println("Pinus densiflora");
			}
		}
	}
}