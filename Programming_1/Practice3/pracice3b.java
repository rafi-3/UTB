package Practice3;

import java.util.Scanner;

public class pracice3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Input number from 1-10 only");
			int num = scanner.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("You typed: One");
				break;
			case 2:
				System.out.println("You typed: Two");
				break;
			case 3:
				System.out.println("You typed: Three");
				break;
			case 4:
				System.out.println("You typed: Four");
				break;
			case 5:
				System.out.println("You typed: Five");
				break;
			case 6:
				System.out.println("You typed: Six");
				break;
			case 7:
				System.out.println("You typed: Seven");
				break;
			case 8:
				System.out.println("You typed: Eight");
				break;
			case 9:
				System.out.println("You typed: nine");
				break;
			case 10:
				System.out.println("You typed: Ten");
				break;
				default:
					System.out.println("Please input from 1-10");
			}
		} 
	}

}
