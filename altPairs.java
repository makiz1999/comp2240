//Problem is taken from: https://codingbat.com/prob/p121596
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter word where you want to remove characters");
    Scanner keyboard = new Scanner(System.in);
    String word = keyboard.nextLine();
    System.out.println("Your final result is: " + altPairs(word));


  }
  public static String altPairs(String str) {
      String removed = "";
      for ( int i = 0; i < str.length() ; i+=4){
        int end = i + 2;
        if ( end > str.length()){
          end = str.length();
        }
        removed += str.substring(i,end);
      }
      return removed;
  }
}
