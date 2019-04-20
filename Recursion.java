// Practice with recursion
class Main {
  public static void main(String[] args) {
    System.out.println("This code will run method inside itself for n times");
    rec(10);
  }
  public static void rec(int n){
    if ( n > 0) {
    System.out.printf("Run number: %d\n", n);
    rec(n-1);
    }
  }
}
