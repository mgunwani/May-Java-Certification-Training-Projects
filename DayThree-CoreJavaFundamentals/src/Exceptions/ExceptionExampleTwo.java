package Exceptions;

/**
 * 
 * @author BhawnaGunwani
 * 
 * Handle Exception using Multiple Catch Block
 * 
 */

class ArithmeticCalculation {
	
	public void division(int num1, int num2) {
		
		try {
			int result = num1/num2;
			System.out.println("Result : " + result);
		} catch(NumberFormatException ex) {
			System.out.println("Exception Occurred (Block 1).");
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println("Exception Occurred (Block 2).");
			System.out.println(ex.getMessage());
		} 
		System.out.println("Remaining Code Here..");
		
	}
	
}

public class ExceptionExampleTwo {
	
	public static void main(String[] args) {
		
		ArithmeticCalculation arithmeticTest = new ArithmeticCalculation();
		arithmeticTest.division(100, 0);
		
	}

}
