import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		BigInteger C = A.divide(B);
		BigInteger D = A.remainder(B);
		
		if(D.compareTo(BigInteger.ZERO) < 0) {
			if(B.compareTo(BigInteger.ZERO) > 0) {
				C = C.subtract(BigInteger.ONE);
				D = D.add(B);;
			} else {
				C = C.add(BigInteger.ONE);
				D = D.subtract(B);
			}
		}
		
		System.out.println(C);
		System.out.println(D);
	}
}