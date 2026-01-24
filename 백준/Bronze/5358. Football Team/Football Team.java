import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String name = sc.nextLine();
			String result = "";
			for(int i = 0; i<name.length(); i++) {
				if(name.charAt(i) == 'i') {
					result += "e";
				} else if(name.charAt(i) == 'e'){
					result += "i";
				} else if(name.charAt(i) == 'I') {
					result += "E";
				} else if(name.charAt(i) == 'E') {
					result += "I";
				} else {
					result += name.charAt(i);
				}
			}
			System.out.println(result);
		}
	}
}