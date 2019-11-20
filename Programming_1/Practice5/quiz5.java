package Practice5;
import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.println("A password must have at least eight characters.");
	        System.out.println("A password consists of only letters and digits.");
	        System.out.println("A password must contain at least two digits.");
	        String pword = input.nextLine();

	        if (validPassword(pword)) {
	            System.out.println("Password is valid: " + pword);
	        } else {
	            System.out.println("Not a valid password: " + pword);
	        }
	        input.close();
	    }

	    public static boolean validPassword(String password) {

	        if (password.length() < 8) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }


	        return (charCount >= 2 && numCount >= 2);
	    }

	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }
	    
}
