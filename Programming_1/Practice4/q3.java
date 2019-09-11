package Practice4;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner (System.in);
	    
	    int [] distinctNumber = new int [10];
	    int count = 0;
	    
	    System.out.println("Enter ten numbers: ");
	    int number = scanner.nextInt();
	    
	    for (int i = 0; i < 10; i ++) {
	      number = scanner.nextInt();
	      boolean distinct = true;
	      
	      for (int j = 0; j < count ; j++)
	        if (number == distinctNumber [j]) {
	          distinct = false;
	          break;
	        }
	      if (distinct) {
	        distinctNumber[count++] = number;
	    
	      }

	    }
	    
	    System.out.println(" ");
	    System.out.println("The number of distinct number is: " + (count -1));
	    System.out.println("The Distinct Numbers are: ");
	    
	    for (int i=0; i<count; i++) {
	      System.out.print(distinctNumber[i] + " ");
	    }
	}
}
