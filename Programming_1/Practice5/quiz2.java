package Practice5;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
			
			while(true){
				System.out.println("Input 3 digit number: ");
				int a = scanner.nextInt();
				sumDigits(a);
			}
		}
		
		public static void sumDigits(int b) {
			int c = (int) b / 100;
			int d = b / 10 % 10 ;
			int e = b % 10;
			
			System.out.println("\n" + c + " + " + d + " + " + e + " = " + (c + d + e));
		}
}
