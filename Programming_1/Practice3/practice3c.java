package Practice3;

import java.util.Scanner;

public class practice3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("|Product code | commission|");
		System.out.println("|     A       |     0.5   |");
		System.out.println("|     B       |     1.0   |");
		System.out.println("|     C       |     2.0   |");
		System.out.println("|     D       |     2.5   |");
		System.out.println("|     E       |     3.0   |");
		System.out.println("--------------------------");

	while (true) {
		System.out.println("please enter the code");
		String code = scanner.nextLine();
		System.out.println("Please enter value of sales($)");
		int sales = scanner.nextInt();
		double commission;
		
		if (code.equalsIgnoreCase("a")) {
			commission = sales * 0.005;
			System.out.println("Your total commission is $" + commission);
		} else if (code.equalsIgnoreCase("b")) {
			commission = sales * 0.01;
		System.out.println("Your total commission is $" + commission);	
		}else if (code.equalsIgnoreCase("c")) {
				commission = sales * 0.02;
			System.out.println("Your total commission is $" + commission);	
		} else if (code.equalsIgnoreCase("d")) {
			commission = sales * 0.025;
		System.out.println("Your total commission is $" + commission);	
		} else if (code.equalsIgnoreCase("e")) {
			commission = sales * 0.03;
		System.out.println("Your total commission is $" + commission);	
		}
		scanner.nextLine();
	} 
	}

}
