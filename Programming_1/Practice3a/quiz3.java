package Practice3a;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		 String word, reverse = "";
	      Scanner scanner = new Scanner(System.in);
	      
	     while (true) {
	      System.out.println("Enter a string to check if it is a palindrome");
	      word = scanner.nextLine();
	     
	      int length = word.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + word.charAt(i);
	         
	      if (word.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	   }    
	}
}
