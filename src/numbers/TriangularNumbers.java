package numbers;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TriangularNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.nextLine());
		if (a.equals(0) || a.abs().equals(a)) {
			System.out.println("That input is invalid enter a number >=0");
			main(args);
		}
		// in.close();
		BigInteger sum = a.multiply(a.add(BigInteger.valueOf(1)));// a*(a+1)/2;
		sum = sum.divide(BigInteger.valueOf(2));
		System.out.println(sum);
		// main(args);
	}

}
