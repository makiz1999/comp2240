class Main {
  public static void main(String[] args) {
    //Sum sum1 = new Sum(5, 7);
    SumSquared squared = new SumSquared(5,6);
    System.out.printf("Sum of 5 and 7 from class SUM = %d\n", squared.getSum());
    System.out.printf("Squared sum from class SUMSQUARED = %d\n", squared.getSquared());
  }

   static class Sum {
    private int a;
    private int b;

    public Sum(int a, int b){
      this.a = a;
      this.b = b;
    }
    public int getSum(){
      return a+b;
    }
  }
   static class SumSquared extends Sum{
	   public SumSquared (int a, int b) {
		   super(a,b);
	   }
	   public int getSquared() {
		   return super.getSum()*super.getSum();
	   }
	  // public int getSum() {
		//   return super.getSum();
	   //}
   }
}
