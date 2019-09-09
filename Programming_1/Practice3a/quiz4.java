package Practice3a;

import java.util.Scanner;

public class quiz4 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int num  , reversedInteger = 0, remainder, originalInteger;
        
        System.out.println("please enter a number:");
        num = scanner.nextInt();
        originalInteger = num;
       
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }
      
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }

}
