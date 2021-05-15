package Exceptions;

/**
 * 
 * @author BhawnaGunwani
 * 
 * To create Custom Exception and handle it.
 */

class CheckAgeException extends Exception {
	public CheckAgeException() {
		super("Invalid Age");
	}
	public CheckAgeException(String message) {
		super(message);
	}
}

class VotingApplication {
	static void validate(int age) throws CheckAgeException {
		if(age < 18) {
			 // throw new CheckAgeException();
			 throw new CheckAgeException("You are not valid to vote.");
		} else {
			System.out.println("You are valid to vote.");
		}		
	}
}

public class ExceptionExampleFive {
	public static void main(String[] args) {
		try {
			VotingApplication.validate(12);
		} catch(CheckAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
