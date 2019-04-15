// This code find minimum, maximum and average value of array
class Main {
  public static void main(String[] args) {
    double [] myArray = {800, 681, 500, 868, 234};
    double [] newArray = statCalc(myArray);
    System.out.printf("Maximum salary is: %.2f\nMinimum salary is: %.2f\nAverage salary is: %.2f\n", newArray[0], newArray[1], newArray[2]);
  }
  public static double [] statCalc (double [] emplArr) {
		double maxVal = emplArr[0];
		double minVal = emplArr[0];
		double sum = emplArr[0];
		double [] arraySal = new double [3];
		
		for ( int x = 1; x < emplArr.length; x++) {
			
			sum = sum + emplArr[x];
			if ( emplArr[x] > maxVal) {
				maxVal = emplArr[x];
			}
			if ( emplArr[x] < minVal) {
				minVal = emplArr[x];
			}
		}
		double avgVal = sum/emplArr.length;
		arraySal[0] = maxVal;
		arraySal[1] = minVal;
		arraySal[2] = avgVal;	
		
		return arraySal;
	}
}
