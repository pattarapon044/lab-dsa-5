package lab.inClass;

import java.util.Scanner;

public class Recursion {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		//simRecur
		System.out.print("Please enter number : ");
		simRecur(keyboard.nextInt());
		
		System.out.println();
		
		//powerRecur
		System.out.print("Enter BASE number  : ");
		int base = keyboard.nextInt();
		System.out.print("Enter POWER number : ");
		int power = keyboard.nextInt();
		System.out.println("Power of " + base + " by " + power + " is " + powerRecur(base, power));
		
		//I'm lazy to use while loop
		main(new String[5]);
	}
	
	public static void simRecur(int count) {
		System.out.println("The value of the count is " + --count);
		if (count > 0) {
			simRecur(count); //Base case
		}
		System.out.println("Now, the count is " + count);
	}
	
	public static int powerRecur(int x, int n) {
		if (n == 0) {
			return 1; //Base case
		}
		return x*powerRecur(x, n-1);
	}
	
	public static int powerLoop(int x, int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= x;
		}
		
		return result;
	}

}
