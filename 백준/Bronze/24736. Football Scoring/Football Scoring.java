import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int team[][] = new int[2][5];
		int score[] = {6, 3, 2, 1, 2};
		
		for(int i = 0; i<team.length; i++) {
			int boxScore = 0;
			for(int j = 0; j<team[i].length; j++) {
				team[i][j] = sc.nextInt();
				boxScore += team[i][j] * score[j];
			}
			System.out.println(boxScore);
		}
	}
}