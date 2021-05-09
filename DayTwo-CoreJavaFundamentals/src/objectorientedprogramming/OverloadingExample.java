package objectorientedprogramming;

/**
 * 
 * @author BhawnaGunwani
 *
 * Overloading Demonstration: The main advantage of overloading is cleanliness of code.
 *
 */

class Calculator {
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public float addition(float num1, float num2) {
		return num1 + num2;
	}
	
	public int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public float addition(int num1, float num2) {
		return num1 + num2;
	}
	
	public float addition(float num1, int num2) {
		return num1 + num2;
	}
	
}

public class OverloadingExample {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Sum of two integers : " + calc.addition(100, 200));
		System.out.println("Sum of two floating integers : " + calc.addition(123.45F, 234.67F));
		System.out.println("Sum of three integers : " + calc.addition(100, 200, 300));
		System.out.println("Sum of one integer and one floating integer : " + calc.addition(100, 150.50F));
		System.out.println("Sum of one floating integer and one integer : " + calc.addition(123.45F, 200));
		
	}
}
