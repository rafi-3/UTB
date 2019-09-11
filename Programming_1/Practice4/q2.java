package Practice4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter scores");
	    System.out.println("**It will stop if negative number is entered");
	    
	    int[] scores = new int[100];    
	    int number;                
	    int totalScore = 0;            
	    int average = 0;              
	    
	  
	    for (int i = 0; i < 100; i++) {
	    	number = scanner.nextInt();      
	      
	      if (number < 0)          
	        break;
	      
	      scores[i] = number;    
	      average += number;    
	      totalScore++;        
	    }

	    average /= totalScore;  

	    int aboveOrEqual = 0;      
	    int belowAverage = 0;                
	    
	    for (int i = 0; i < totalScore; i++) {
	      if (scores[i] >= average)
	        aboveOrEqual++;        
	      else
	    	  belowAverage++;            
	    }

	    System.out.println("Average of scores: " + average);
	    System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
	    System.out.println("Number of scores below average: " + belowAverage);  
	    
	    scanner.close();
	}

}
