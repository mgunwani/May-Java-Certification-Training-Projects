package Exceptions;

class VotingSystem {
	
	static void validate(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("Exception Message: You are not valid to vote.");
		} else {
			System.out.println("You are valid to vote.");
		}
		
	}
}

public class ExceptionExampleFour {

	public static void main(String[] args) {
	
		try {
			VotingSystem.validate(12);
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
