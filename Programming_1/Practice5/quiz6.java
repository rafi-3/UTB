package Practice5;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter ten values: ");
		double [] numbers = new double [10];
		
		for (int i = 0; i < numbers.length; i++ ) {
			numbers [i] = scanner.nextDouble();
		}
		
		System.out.println("The average of 10 numbers is " +average(numbers));
		
		scanner.close();
	}
	
	public static int average (int [] array) {
		
		int totalAvg = 0;
		
		for (int i = 0; i < array.length; i++) {
			totalAvg += array [i];
		}
		
		return totalAvg / array.length;
		
	}
	
	public static double average (double[] array) {
		
		double totalAvg = 0;
		
		for (int i = 0; i < array.length; i++) {
			totalAvg += array[i];
		}
		
		return totalAvg / array.length;
	}

}
