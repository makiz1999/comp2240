//Blackjack game

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner games = new Scanner(System.in);
    int numGames = 0;
    System.out.println("How many times you would like to play blackjack?");
    numGames = games.nextInt();
    System.out.println("Number of games you would like to play: " + numGames);
    System.out.printf("\nWELCOME TO THE GAME\n\nRules of blackjack: \nYou and Mr.Computer will get a number from 1 to 21, whoever will get number closer to 21 wins\nIf someone will get number that is bigger than 21 he loses\nIf you both get number bigger than 21 it is tie\n\n");

    for ( int i = 0; i < numGames; i++){
      System.out.printf("\nGAME NUMBER: %d\n", i+1);
      Random rand = new Random();
      int you = rand.nextInt(20);
      you += 1;
      int comp = rand.nextInt(20);
      comp += 1;
      System.out.printf("YOU: %d    MR.COMPUTER:%d\n", you, comp);
      System.out.println(blackjack(you, comp));
    }
  }

  public static String blackjack(int a, int b) {
    if ( (a > b && a <= 21) || (b > 21 && a <= 21)){
      return String.format("CONGRATULATIONS. YOU WON");
    } else if ((b > a && b <= 21) || ( a > 21 && b <= 21)) {
      return String.format("YOU LOST");
    } else {
      return String.format("IT IS TIE"); 
    } 
  }
}
