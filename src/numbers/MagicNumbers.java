package numbers;

import java.util.Scanner;

public class MagicNumbers {
	static int[] squares;
	static int[] triangular;

	public static void main(String[] args) {
		triangular = triangulars(100);
		squares = square((int) (Math.sqrt(triangular[triangular.length - 1]) + 1));
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		int count = 0;
		int num = 0;
		while (count <= test) {
			if (magic(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	private static int[] square(int x) {
		int[] out = new int[x];
		for (int i = 0; i < x; i++) {
			out[i] = i * i;
		}
		return out;
	}

	public static boolean magic(int x) {
		return (isElement(x, squares) && isElement(x, triangular));
	}

	public static int sumArray(int[] in) {
		int out = 0;
		for (int i = 0; i < in.length; i++) {
			out += in[i];
		}
		return out;
	}

	public static int[] triangulars(int x) {
		int[] out = new int[x];
		for (int i = 0; i < x; i++) {
			out[i] = i * (i + 1) / 2;
		}
		return out;
	}

	public static boolean isElement(int x, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				return true;
			}
		}
		return false;
	}
}
