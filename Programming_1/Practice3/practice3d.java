package Practice3;

import java.util.Scanner;

public class practice3d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int m1,m2,m3,m4,a;
		
		System.out.println("Please enter student's name: ");
		name = scanner.nextLine();
		
		System.out.println("first mark: ");
		m1 = scanner.nextInt();
		if(m1>=0 && m1<=100) {
			System.out.println("second mark: ");
			m2 = scanner.nextInt();
			
			if(m2>=0 && m2<=100) {
				System.out.println("third mark: ");
				m3 = scanner.nextInt();
				
				if(m3>=0 && m3<=100) {
					System.out.println("fourth mark: ");
					m4 = scanner.nextInt();
					
					if(m4>=0 && m4<=100) {
						a = m1+m2+m3+m4 /4;
						String g;
						if (a >= 90) {
							g = "A*";
						} else if (a >= 80) {
							g = "A";
						} else if (a >= 70) {
							g = "B";
						} else if (a >= 60) {
							g = "C";
						} else if (a >= 50) {
							g = "D";
						} else if (a < 50) {
							g = "F";
						}
						
						System.out.println(name + " got an average marks of " + a + " grade is " );
						System.out.println(g);
					}
				}
			}
		}

	}

}
