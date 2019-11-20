package Practice6;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Palindrome check: ");
			String word = scanner.nextLine();
			
			if(word.equals(pal(word))) {
				System.out.println(word + " is palindrome.\n");
			} else {
				System.out.println(word + " is not palindrome.\n");
			}
		}
	}
	
	public static String pal(String p) {
		int l = p.length() - 1;
		String reverseWord = "";
		
		for(int i = l; i >= 0; i--) {
			reverseWord = reverseWord + p.charAt(i);
		}
		
		return reverseWord;
	}
}
