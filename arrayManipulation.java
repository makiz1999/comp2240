import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int [][] myArray = {
      {5, 6, 8, 9, 10},
      {6, 13, 2, 1, 7},
      {10, 3, 7, 2, 18},
    };
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("In what order you want to print out 2D array?\nClassic: Press 1\nReverse: Press 2\n");
    int choice = keyboard.nextInt();
    if ( choice == 1){
      for ( int i = 0; i < myArray.length; i++){
        for ( int j = 0; j < myArray[i].length; j++){
          System.out.print(myArray[i][j] + " ");
        }
        System.out.println();
      }
    }
    else if ( choice == 2){
      for ( int i = myArray.length-1; i >= 0; i--){
        for ( int j = myArray[i].length-1; j >= 0; j--){
          System.out.print(myArray[i][j] + " ");
        }
        System.out.println();
    }
    }
  }
}
