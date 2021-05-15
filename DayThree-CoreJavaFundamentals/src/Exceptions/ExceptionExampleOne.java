package Exceptions;

/**
 * 
 * @author BhawnaGunwani
 * 
 *  Raising: ArithmeticException
 */

class ArithmeticTest {
	
	public void division(int num1, int num2) {
		int result = num1/num2;
		System.out.println("Result : " + result);
	}
	
}

public class ExceptionExampleOne {

	public static void main(String[] args) {
	
		ArithmeticTest arithmeticTest = new ArithmeticTest();
		arithmeticTest.division(100, 0);
		
	}
	
}
