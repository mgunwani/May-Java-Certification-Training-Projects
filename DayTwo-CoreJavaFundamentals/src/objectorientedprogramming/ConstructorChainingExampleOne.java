package objectorientedprogramming;

/**
 * 
 * @author BhawnaGunwani
 * 
 * Constructor Chaining with Inheritance
 * 
 */

class Person {
	int id;
	String name;
	public Person() {
		this.id = 100;
		this.name = "Annonymous";
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void displayDetails1() {
		System.out.println("Id : " + this.id + ", Name : " + this.name);
	}
}

class Employee extends Person {
	float salary;
	String company;
	public Employee() {
		super();
		this.salary = 12000;
		this.company = "Simplilearn";
	}
	public Employee(int id, String name, float salary, String company) {
		super(id, name);
		this.salary = salary;
		this.company = company;
	}
	public void displayDetails2() {
		System.out.println("Salary : " + this.salary + ", Company : " + this.company);
	}
}

public class ConstructorChainingExampleOne {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Bhawna" , 50000, "Google");
		emp.displayDetails1();
		emp.displayDetails2();
		
	}
	
}
