//This probem is taken from Codingbat - https://codingbat.com/prob/p187050
//Not finished

class Main {
  public static void main(String[] args) {
    int [] myArray = {0, 6, 3, 0, 3};
    zeroMax(myArray);
    for ( int i = 0; i < myArray.length; i++){
      System.out.print(myArray[i] + " ");
    }
  }

public static int[] zeroMax(int[] nums) {
  int potential = 0;
  for ( int i = 0; i < nums.length; i++){
    if ( nums[i] % 2 != 0 && nums[i] > 0){
      potential = nums[i];
    }
    if ( nums[i] == 0){
      nums[i] = potential;
    }
  }
  return nums;
  }
}
