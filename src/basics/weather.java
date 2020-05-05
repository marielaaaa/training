package basics;

import java.util.Scanner;

public class weather {
	
	private class jj{
		
	}
	public static void main(String[] args) {
				
		System.out.println("Enter day of Week: ");
		Scanner b = new Scanner(System.in);
		String a = b.nextLine();
		
		switch (a){
		case "Monday" : System.out.println("It is Monday!");
		break;
		case "Tuesday" : System.out.println("It is Tuesday!");
		break;
		case "Wednesday" : System.out.println("It is Wednesday!");
		break;
		
		}
		
		
		
	}
}
