package Practice7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Enter two integers: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				int result = sum(number1, number2);
				System.out.println(number1 + " + " + number2 + " is " + result);
			} catch (InputMismatchException e) {
				System.out.println("Please input number only!");
			}
			
			input.nextLine();
		}

	}
	
	public static int sum(int number1, int number2) {           
		 return number1 + number2;      
	}
}
