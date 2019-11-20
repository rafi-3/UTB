package Practice6;

import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 1;
		while(true) {
			System.out.println("input a number to get the length");
			int n = scanner.nextInt();
			
			System.out.println("S(" + a + ") = " + n + " length is " + numOfDigits(n));
			a++;
		}
	}
	
	 public static int  numOfDigits(int n) {
		 int l = Integer.toString(n).length();
		 return l;
	 }

}
