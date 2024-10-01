package febonacciserices.com.in;

import java.util.Scanner;

public class PrintFebonacci {
	public static void printFibonacciSequence(int count) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.print("Fibonacci Sequence: " + a + ", " + b);
		for (int i = 1; i <= count; i++) {
			int c = a + b;
			System.out.print(", " + c);

			a = b;
			b = c;

		}
		sc.close();

	}

	public static void main(String[] args) {
		printFibonacciSequence(10);
	}

}