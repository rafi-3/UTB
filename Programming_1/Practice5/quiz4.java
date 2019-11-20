package Practice5;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a string: ");
			String word = scanner.next();
			
			System.out.print("Char: ");
			char letter = scanner.next().charAt(0);
			
			System.out.println("The number of occurences for letter " + letter + " in " + word + " is "  + count(word, letter));
		}

	}

	public static int count(String str, char a) {
		int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) count++;
        }
		return count;
	}
}
