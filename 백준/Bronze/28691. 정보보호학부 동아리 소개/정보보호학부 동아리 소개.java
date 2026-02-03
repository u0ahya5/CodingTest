import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		String club_Name = sc.nextLine();
		
		if(club_Name.equals("M")) {
			System.out.print("MatKor");
		} else if (club_Name.equals("W")) {
			System.out.print("WiCys");
		} else if (club_Name.equals("C")) {
			System.out.print("CyKor");
		} else if (club_Name.equals("A")) {
			System.out.print("AlKor");
		} else {
			System.out.print("$clear");
		}
	}
}