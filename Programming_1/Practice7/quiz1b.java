package Practice7;

import java.util.Scanner;

public class quiz1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Enter two integers: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				int result = quotient(number1, number2);
				System.out.println(number1 + " / " + number2 + " is " + result);
			} catch (Exception e) {
				System.out.println("Please input number only!");
			}
			
			input.nextLine();
		}


	}
	
	public static int quotient(int number1, int number2) {           
		 return number1 / number2;      
	}

}
