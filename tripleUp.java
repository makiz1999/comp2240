// This problem is taken from: https://codingbat.com/prob/p137874
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter how many numbers you would like to put in array");
    int numbers = keyboard.nextInt();
    int [] myArray = new int [numbers];
    
    for ( int i = 0; i < myArray.length; i++){
      System.out.printf("Please enter value for number %d: \n", i+1);
      myArray[i] = keyboard.nextInt();
    }
    if ( tripleUp(myArray) == true){
      System.out.println("Your array has at least 3 adjctent numbers");
    } else {
      System.out.println("Your array doesn't have 3 adjactent numbers");
    }
    
  }
  static public boolean tripleUp(int[] nums) {
    boolean success = false;
    for ( int i = 1; i < nums.length-1; i++){
      if ( nums[i] == nums[i+1]-1 && nums[i] == nums[i-1]+1 ){
        success = true;
        break;
      } else {
        success = false;
      }
    }
    return success;
  }

}
