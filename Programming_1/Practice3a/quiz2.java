package Practice3a;

import java.util.Scanner;

public class quiz2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomNum1 = (int) (Math.random() * 9);
		int randomNum2 = (int) (Math.random() * 9);
		
		int calc = randomNum1 - randomNum2;
		
		
		System.out.println("What is " + randomNum1 + "-" + randomNum2);
		int ans;
		ans = scanner.nextInt();
		
		if (ans==calc) {
			System.out.println("Your answer is correct");
		} else{
			System.out.println("The correct answer is " + calc);
		}
	}
}

