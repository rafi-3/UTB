package week_4;

import java.util.Scanner;

public class practice2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text;
		
		System.out.println("Please write something");
		text = scanner.nextLine();
		
		System.out.println("Uppercase: " + text.toUpperCase());
	    System.out.println("Lowercase: " + text.toLowerCase());
		scanner.close();
	}

}
