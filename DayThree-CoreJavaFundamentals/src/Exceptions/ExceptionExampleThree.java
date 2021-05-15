package Exceptions;

/**
 * 
 * @author BhawnaGunwani
 *
 * Using Finally block with Exception Handling:
 */

class ArithmeticCalc {
	
	public void division(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		} catch(NumberFormatException ex) {
			System.out.println("Exception Occurred (Block 1).");
			System.out.println(ex.getMessage());
		} catch(IndexOutOfBoundsException ex) {
			System.out.println("Exception Occurred (Block 2).");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Result : " + result);
			System.out.println("This finally block will always execute.");
		} 
		System.out.println("Remaining Code Here..");
		
		
	}
	
}

public class ExceptionExampleThree {
	
	public static void main(String[] args) {
		
		ArithmeticCalc arithmeticCalc = new ArithmeticCalc();
		arithmeticCalc.division(100, 0);
		
	}

}
