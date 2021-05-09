package objectorientedprogramming;

class PersonDetail {
	int id;
	String name;
	public PersonDetail() {
		this.id = 100;
		this.name = "Annonymous";
	}
	public PersonDetail(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void displayDetails() {
		System.out.println("Id : " + this.id + ", Name : " + this.name);
	}
}

class EmployeeDetail extends PersonDetail {
	float salary;
	String company;
	public EmployeeDetail() {
		super();
		this.salary = 12000;
		this.company = "Simplilearn";
	}
	public EmployeeDetail(int id, String name, float salary, String company) {
		super(id, name);
		this.salary = salary;
		this.company = company;
	}
	public void displayDetails() {
		System.out.println("Salary : " + this.salary + ", Company : " + this.company);
	}
}


public class OverridingExample {
	
	public static void main(String[] args) {
		
		PersonDetail emp = new PersonDetail();
		emp.displayDetails();
		emp = new EmployeeDetail();
		emp.displayDetails();
		
	}

}
