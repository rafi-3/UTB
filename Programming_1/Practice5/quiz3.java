package Practice5;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter ten numbers: ");
		double [] numbers = new double [10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = scanner.nextDouble();
			
		}
		
		System.out.println("The minimum number of is " + min(numbers));
		
		scanner.close();
	}
	
	public static double min (double[] array) {
		
		double min = array [0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array [i] < min)
				min = array[i];
		}
		
		return min;
	}
}
