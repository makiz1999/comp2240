//This probem is taken from Codingbat - https://codingbat.com/prob/p105031

class Main {
  public static void main(String[] args) {
    int[] myArray = {4,6,2,18,1};
    shiftLeft(myArray);
    for ( int x = 0; x < myArray.length; x++){
      System.out.print(myArray[x] + " ");
    }
    System.out.println();
    int[] mySecArray = {58, 63, 9, 23, 67, 18, 6};
    shiftLeft(mySecArray);
    for ( int z = 0; z < mySecArray.length; z++){
      System.out.print(mySecArray[z] + " ");
    }
  }

public static int[] shiftLeft(int[] nums) {
  int firstNum = nums[0];
  for ( int i = 1; i < nums.length; i++){
    nums[i-1] = nums[i];
  }
  nums[nums.length-1] = firstNum;
  return nums;
}
}
