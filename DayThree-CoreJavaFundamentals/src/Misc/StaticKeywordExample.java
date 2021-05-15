package Misc;

class Employee {
	
	// Data Members or Instance Data Members
	private int id;
	private String name;
	private float salary;
	
	// Static Data Members
	private static String companyName;
	private static String applicationName;
	private static String applicationVersion;
	
	// Static Block
	static {
		companyName = "Simplilearn";
		applicationName = "Employee Management System";
		applicationVersion = "Ev001";
	}
	
	// Static Method
	public static void applicationDetails() {
		System.out.println("Application Version : " + Employee.applicationVersion);
		System.out.println("Application Name : " + Employee.applicationName);
	}

	// Instance Constructor
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Non-Static Method
	public void displayDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
		System.out.println("Company Name : " + Employee.companyName);
	}

}

public class StaticKeywordExample {
	
	public static void main(String[] args) {
		
		Employee.applicationDetails();
		
		System.out.println("------------------------------");
		
		Employee employee1 = new Employee(101, "Kartik", 23000);
		employee1.displayDetails();
		
		System.out.println("------------------------------");
		
		Employee employee2 = new Employee(102, "Smith", 25000);
		employee2.displayDetails();
		
		System.out.println("------------------------------");
		
		Employee employee3 = new Employee(103, "Shreya", 25000);
		employee3.displayDetails();
		
	}

}
