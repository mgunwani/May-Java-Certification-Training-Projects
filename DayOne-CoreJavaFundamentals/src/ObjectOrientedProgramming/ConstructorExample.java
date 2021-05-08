package ObjectOrientedProgramming;

import models.Employee;

/**
 * Each and Every class is by default inherited with Object class.
 * Object class has the default constructor to initialize the default values
 * to each data members of sub classes.
 */


public class ConstructorExample {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.displayDetails();
		
		System.out.println("--------------------------------");
		
		Employee emp2 = new Employee(102, "John Smith", 1234.56F);
		emp2.displayDetails();
		
	}

}
