package Practice3;

import java.util.Scanner;

public class practice3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    String input1, input2;
	    
	    System.out.println("First input");
	    input1 = scanner.nextLine();
	    
	    System.out.println("Second input");
	    input2 = scanner.nextLine();
	    scanner.close();
	    
	    if(input1.length() > input2.length()) {
	      System.out.println(input1);
	    } else if(input1.length() == input2.length()) {
	      if(input1.compareTo(input2) > 0) {
	        System.out.println(input2);
	      } else {
	        System.out.println(input1);
	      }
	    } else {
	      System.out.println(input2);
	    }
	    
	}

}
