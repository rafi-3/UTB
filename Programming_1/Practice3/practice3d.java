package Practice3;

import java.util.Scanner;

public class practice3d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    String name,grade = "";
	    int mark1,mark2,mark3,mark4,marks;
	    
	    System.out.println("Name: ");
	    name = scanner.next();
	    
	    System.out.println("Mark 1: ");
	    mark1 = scanner.nextInt();
	    
	    if(mark1 > -1 && mark1 < 101) {
	      System.out.println("Mark 2:");
	      mark2 = scanner.nextInt();
	      
	      
	      if(mark2 > -1 && mark2 < 101) {
	        System.out.println("Mark 3: ");
	        mark3 = scanner.nextInt();
	        
	        if(mark3 > -1 && mark3 < 101) {
	          System.out.println("Mark 4: ");
	          mark4 = scanner.nextInt();
	          scanner.close();
	          
	          if(mark4 > -1 && mark4 < 101) {
	            marks = (mark1 + mark2 + mark3 + mark4)/4;
	            
	            if(marks >= 90) {
	              grade = "A*";
	            } else if(marks >= 80 && marks < 90) {
	              grade = "A";
	            } else if(marks >= 70 && marks < 80) {
	              grade = "B";
	            } else if(marks >= 60 && marks < 70) {
	              grade = "C";
	            } else if(marks >= 50 && marks < 60) {
	              grade = "D";
	            } else if(marks < 50) {
	              grade = "F";
	            }
	            
	            System.out.println("(" + name + ") average marks: " + marks + " grade: " + grade);

	          } else {
	            System.out.println("Invalid range!");
	          }
	        } else {
	          System.out.println("Invalid range!");
	        }
	      } else {
	        System.out.println("Invalid range!");
	      }
	    } else {
	      System.out.println("Invalid range!");
	    }
	}
}
