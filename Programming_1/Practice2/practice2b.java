package Practice2;

import java.util.Scanner;

public class practice2b {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double firstNum, secondNum, thirdNum, sum, average;
		
		System.out.println("please enter first number");
		firstNum= scanner.nextDouble();
		
		System.out.println("please enter second number");
		secondNum= scanner.nextDouble();
		
		System.out.println("please enter third number");
		thirdNum= scanner.nextDouble();
		
		sum = firstNum + secondNum + thirdNum;
		average = sum/3;
		
		System.out.println("The total of numbers is : " + sum +"\nThe average is : " + average);
		
		scanner.close();
	}
}