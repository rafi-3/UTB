package Asg;

import java.util.Scanner;

public class Hangman {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] words = {"intelligence", "mosquito", "binomial", "chiaroscurist", "alphabetical", "oddities", "pronunciation" };
    System.out.println("Let's play hangman game");
    
//  when its false the game will end
    while(true) {
    	
//    randomize word for quiz
      String word = words[(int) (Math.random() * words.length)];
      String hidden = new String(new char[word.length()]).replace("\0", "*");
      int tries = 0;
      
//    number of attempts
      while (tries < 5 && hidden.contains("*")) {
        System.out.println("(Guess) Enter a letter in the word " + hidden);
        String guess = scanner.nextLine();
        
        String unHide = "";
        for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == guess.charAt(0)) {
            unHide += guess.charAt(0);
          } else if (hidden.charAt(i) != '*') {
            unHide += word.charAt(i);
          } else {
            unHide += "*";
          }
        }
        
//      to prompt the the letter is in correct and only reveals if the letter is correct
        if (hidden.equals(unHide)) {
          tries++;
          System.out.println(guess + " is not in the word.");
        } else {
          hidden = unHide;
        }
        
        if (hidden.equals(word)) {
          System.out.println("The word is " + word + ". You missed " + tries + " time");
        }
        
      }
      if(tries == 5) {
    	  System.out.println("you lose");
      }
      
      System.out.println("Do you want to guess another word? (y/n)");
      String playAgain = scanner.nextLine();
      
      if(!playAgain.equalsIgnoreCase("y")) {
        System.out.println("\nThank you for playing!");
        break;
      }
    }
    
    scanner.close();

  }

}
