package Misc;

class Calculation {

	// Final Variable
	final int number = 1000;
	// Blank Final Variable
	final int count;
	// Static Blank Final Variable
	static final int numberOfValues;

	static {
		numberOfValues = 0;
	}
	
	public Calculation() {
		this.count = 100;
	}

	public void display() {
		System.out.println(this.count);
		System.out.println(this.number);
		// this.count++;		// throws Compile Time Error
	}
	
}

public class FinalVariableExample {
	
	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		calc.display();
		calc.display();
		calc.display();
		
	}

}
