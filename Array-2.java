// Problem is taken from: https://codingbat.com/prob/p196640
class Main {
  public static void main(String[] args) {
    int [] myArray = {5, 8, 10, 1};
    
}
  public int bigDiff(int[] nums) {
    int smallest = nums[0];
    int largest = nums[0];
    for ( int i = 1; i < nums.length; i++){
      if ( nums[i] < smallest){
        smallest = nums[i];
      }
      if ( nums[i] > largest){
        largest = nums[i];
      }
    }
    return largest - smallest;
  }


}
