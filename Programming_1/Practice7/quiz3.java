package Practice7;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[100];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = 100 + i;
		}
		
		while(true) {
			try {
				System.out.println("Enter the index of the array");
				int n = sc.nextInt();
				
				System.out.println("Index " + n + " contains number " + number[n] );
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is out of bound");
			} catch(Exception e) {
				System.out.println("Enter number only!");
			}
			sc.nextLine();
		}

	}

}
