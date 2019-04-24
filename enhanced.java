//Here I jst practice enhanced for loops with different data types of array
class Main {
  public static void main(String[] args) {
    String[] name = {"Max", "John","Vladimir","Orange"};
    int[] number = {5,6,2,7,9};
    double[] answer = {5.13, 6.28, 7.82, 1.1};

    for(String counter: name){
      System.out.println("Name is " + counter);
    }
    for( int counter: number){
      System.out.println("Number is " + counter);
    }
    for ( double counter: answer){
      System.out.println("Double is " + counter);
    }
  }
}
