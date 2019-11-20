package Practice4;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  int seat = 0;
		  String[][] seats = {
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"},
		    {"A", "B", "C", "D"}
		  };
		  int x = 0, y = 0;
		  
		  System.out.println("please choose a seat");
		  
		  while(seat != 28) {
		   for(int i = 0; i < seats.length; i++) {
		    System.out.print((i + 1) + "  ");
		    for(int j = 0; j < seats[i].length; j++) {
		     System.out.print(seats[i][j] + " ");
		    }
		    System.out.println();
		   }
		   
		   System.out.println("\nPlease select your seat base on the table above! (press 0 for exit)");
		   String input = scanner.nextLine().toLowerCase();
		   
		   if(input.length() == 2) {
		    if(input.charAt(0) > '0' && input.charAt(0) < '8') {
		     if(input.charAt(1) == 'a' || input.charAt(1) == 'b' || input.charAt(1) == 'c' || input.charAt(1) == 'd') {
		      switch(input.charAt(1)) {
		      case 'a': y = 0; break;
		      case 'b': y = 1; break;
		      case 'c': y = 2; break;
		      case 'd': y = 3; break;
		      }
		      
		      x = Character.getNumericValue(input.charAt(0)) - 1;
		      if(!seats[x][y].equals("X")) {
		       System.out.println("Thank you for chosing this seat");
		       seats[x][y] = "X";
		       seat++;
		      } else {
		       System.out.println("Seat is taken. Please choose a different seat. (press 0 for exit)");
		      }
		     } else {
		      System.out.println("Error! The seat column does not exsist!");
		     }
		    } else if(input.charAt(0) == '0') {
		     System.out.println("Thank you for using RB! Have a nice day!");
		     break;
		    } else {
		     System.out.println("Error! The seat does not exsist!");
		    }
		   } else {
		    System.out.println("Error! The seat does not exsist!");
		   }
		  }
		  
		  if(seat == 28) {
		   System.out.println("Sorry all seat are currently full. Thank you!");
		  }
		  scanner.close();
	}
}
