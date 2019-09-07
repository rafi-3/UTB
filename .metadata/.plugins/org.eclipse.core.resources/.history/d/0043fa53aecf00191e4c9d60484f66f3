package Practice3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class practice3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text1, text2;
		
		System.out.println("First text: ");
		text1 = scanner.nextLine();
		System.out.println("Second text: ");
		text2 = scanner.nextLine();
		
		int text1length = text1.length();
		int text2length = text2.length();
		
		if (text1length > text2length) {
			System.out.println(text1);
		} else if (text2length> text1length) {
			System.out.println(text2);
		} else if (text1length == text2length) {
			List<String> textIn = Arrays.asList(
					text1,text2
					);
			
			textIn.sort(Comparator.naturalOrder());
			System.out.println(textIn);
		}
		
		
		scanner.close();
	}

}
