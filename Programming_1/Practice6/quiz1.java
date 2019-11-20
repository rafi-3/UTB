package Practice6;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.println("Enter 2 int:");
			System.out.print("1: ");
			a = sc.nextInt();
			
			System.out.print("2: ");
			b = sc.nextInt();
			
			System.out.println("The GCD of (" + a + ", " + b + ") is: " + gcd(a,b));
		}

	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}	
	}

}
