//This probem is taken from Codingbat - https://codingbat.com/prob/p154669
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.printf("This is programm to find factorial\nPlease enter number you would like to factor\n");
    Scanner factor = new Scanner(System.in);
    int number = factor.nextInt();
    System.out.printf("Factorial of number %d = %d", number, factorial(number));
  }
  static public int factorial(int n) {
    int answer;
    if ( n == 1 ){
      return 1;
    } 
    answer = n * factorial (n-1);
    return answer;
  }
}
