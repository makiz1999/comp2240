//Methods and arrays practice
import java.util.Scanner;

public class Main {
		
	public static double takeHome (double tax, int salary) {
		double takeSal = salary - (tax/100)*salary;
		return takeSal;
	}
	public static void printArray (double [] myArr) {
		for ( int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + "\t");
		}
	}
	public static double [] array(int c) {
		Scanner input = new Scanner(System.in);
		double [] myArr = new double [c];
		for ( int i = 0; i < c; i++) {
			System.out.println("Enter your tax: ");
			double tax = input.nextDouble();
			System.out.println("Enter your salary: ");
			int salary = input.nextInt();
			
			double val = takeHome(tax,salary);
			myArr[i] = val;
		}
		return myArr;
	}
	
	
	public static void main(String[] args) {

	double [] newArr = array(4);
	printArray(newArr);
	}
}
