package models;

public class Employee {
	
	// Data Members:
	private int code;
	private String name;
	private float salary;
	
	// Default or Parameterless Constructor
	public Employee() {
		this.code = 1001;
		this.name = "Annonymous";
		this.salary = 12456.78F;	
	}
	
	// Parameterized Constructor
	public Employee(int ecode, String ename, float esalary) {
		this.code = ecode;
		this.name = ename;
		this.salary = esalary;
	}
	
	// Member Function:
	public void displayDetails() {
		System.out.println("Employee Details : ");
		System.out.println("Code : " + this.code);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
	}
	
}