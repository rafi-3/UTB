package Practice3;

import java.util.Scanner;

public class practice3e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    while(true) {
	      System.out.println("Enter a String: ");
	      String text = scanner.next();
	      String reverseText = "";
	      
	      for(int i = text.length() - 1; i >= 0; i--) {
	        reverseText = reverseText + text.charAt(i);
	      }
	      
	      System.out.println("The reverse String of \"" + text + "\" is \"" + reverseText + "\"\n");
	    }
	}

}
