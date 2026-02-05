import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int birth[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int standard[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int m_age = standard[0] - birth[0];
		if(birth[1] > standard[1] || (birth[1] == standard[1] && birth[2] > standard[2])) {
			m_age--;
		}
		System.out.println(m_age);
		System.out.println(standard[0] - birth[0] + 1);
		System.out.println(standard[0] - birth[0]);
	}
}