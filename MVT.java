//I was doing this code for math presentation
class Main {
  public static void main(String[] args) {
    int aValue = 1;
    int bValue = 3;
    int cDerivative;
    double fB = (1.0/3.0);
    double fA = (1.0/1.0);
    double numinator = fB-fA;
    double denominator = bValue - aValue;
    System.out.println("\nVerify the function f(x) = 1/x satisfies MVT in given interval [1,3]\n");
    System.out.printf("f(b)-f(a) = %.2f\n",numinator);
    System.out.println("b-a = " + denominator);
    System.out.printf("f(b)-f(a)/b-a = %.2f\n",(numinator/denominator));
    System.out.println("Derivative of 1/x = -1/x^2");
    double rightSide = 3;
    System.out.printf("x^2 = %.2f\n",rightSide);
    System.out.printf("x = %.2f\n", Math.sqrt(rightSide));

    if(Math.sqrt(rightSide) < 3 || Math.sqrt(rightSide)> 1){
      System.out.println("MVT is satisfied");
    }
  }
}
