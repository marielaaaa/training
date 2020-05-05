package basics;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Input num1: ");
		Scanner num1 = new Scanner(System.in);
		String a = num1.nextLine();
		System.out.println("Input num2: ");
		Scanner num2 = new Scanner(System.in);
		String b = num2.nextLine();
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("Result: " + result);
				
	}
}
