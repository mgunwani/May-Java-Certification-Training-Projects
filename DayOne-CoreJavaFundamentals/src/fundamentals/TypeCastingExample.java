package fundamentals;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		/*
		 * int num1 = 100; int num2 = 200; // double num3 = num1 + num2; // Implicit
		 * Type Casting (By Compiler) short num3 = (short)(num1 + num2); // Explicit
		 * Type Casting (By Developer) System.out.println("Number One : " + num1);
		 * System.out.println("Number Two : " + num2);
		 * System.out.println("Number Three : " + num3);
		 */
		
		// byte, short, char
		
		byte num1 = 100;
		byte num2 = 120;
		// int num3 = num1 + num2;			// Implicit Casting
		byte num3 = (byte)(num1 + num2);	// Explicit Casting
		System.out.println("Number One : " + num1);
		System.out.println("Number Two : " + num2);
		System.out.println("Number Three : " + num3);
	}

}
