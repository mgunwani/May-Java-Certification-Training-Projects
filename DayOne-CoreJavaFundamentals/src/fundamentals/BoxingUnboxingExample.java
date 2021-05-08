package fundamentals;

/**
 * Boxing: Converts primitive data types into reference types.
 * UnBoxing: Converts Reference Types into primitive types.
 */

public class BoxingUnboxingExample {

	public static void main(String[] args) {
	
		/*
		 * Boxing: Converting Primitive into Object.
		int a = 100;
		Integer intObj = Integer.valueOf(a);
		System.out.println(a);
		System.out.println(intObj);
		*/
		
		// UnBoxing: Converting Object into Primitive
		Integer intObj = new Integer(100);
		int a = intObj.intValue();
		System.out.println(intObj);
		System.out.println(a);
		
	}
	
}
