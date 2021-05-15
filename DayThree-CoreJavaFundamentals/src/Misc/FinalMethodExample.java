package Misc;

class Shape {
	public final void draw() {
		System.out.println("Draw Method in Shape Class..");
	}
}

class Rectangle extends Shape {
	
	// This will give compile time error. Final Method can't be overridden.
	/*
	 * public void draw() 
	 * { 
	 * 	System.out.println("Draw Method in Rectangle Class..");
	 * }
	 */
}

public class FinalMethodExample {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.draw();
		
	}

}
