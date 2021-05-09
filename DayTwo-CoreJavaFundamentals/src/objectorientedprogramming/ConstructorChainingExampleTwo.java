package objectorientedprogramming;

/**
 * 
 * @author BhawnaGunwani
 *
 * Demonstrating Constructor Chaining and Constructor Overloading
 */

class Calculation {
	
	public Calculation() {
		this(100);
		System.out.println("Default Constructor Invoked!!");
	}
	
	public Calculation(int num) {
		System.out.println("Constructor with one parameter Invoked!!");
	}
	
	public Calculation(int num1, int num) {
		this();
		System.out.println("Constructor with two parameters Invoked!!");
	}
}

public class ConstructorChainingExampleTwo {
	
	public static void main(String[] args) {
		
		new Calculation(10, 20);
		
	}

}
