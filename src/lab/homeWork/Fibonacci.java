package lab.homeWork;

import java.util.Scanner;

public class Fibonacci {

	private static Scanner keyboard = new Scanner(System.in);

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1 || n == 2) {
			return 1;
		}

		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public static int fiboLoop(int n) {
		int current = 0;
		int next = 1;

		for (int i = 0; i < n; i++) {
			int sum = current + next;
			current = next;
			next = sum;
		}
		return current;
	}

	public static void main(String[] args) {
		while (true) {
			System.out.print("Please enter number : ");
			System.out.println("Fibonacci result is " + fibonacci(keyboard.nextInt()));
		}
	}
}
