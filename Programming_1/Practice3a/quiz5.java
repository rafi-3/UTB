package Practice3a;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    double number, positive = 0, negative = 0, total = 0, totalNum = 0;
	    
	    do {
	      System.out.println("Enter an integer, the input ends if it is 0:");
	      number = scanner.nextInt();
	      total = total + number;
	      totalNum++;
	      
	      if(number > 0) {
	    	  positive++;
	      } else if(number == 0) {
	        
	        if(totalNum == 1) {
	          System.out.println("No numbers are entered except 0");
	        } else {
	          System.out.println("\nThe number of positives: " + positive);
	          System.out.println("The number of negatives: " + negative);
	          System.out.println("The total is: " + total);
	          System.out.println("The verage is: " + (total/totalNum));
	        }
	        
	      } else {
	        negative++;
	      }
	        
	    } while(!(number == 0));
	    
	    scanner.close();
	}

}
