package fundamentals;

import java.util.Scanner;

public class InputPrimitiveTypes {
	
	public static void main(String[] args) {
		
		/*
		 * int code = 1001; String name = "King Kochhar"; long projectCode = 12345678L;
		 * float salary = 12345.56F;
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = scan.nextLine(); 
		System.out.print("Enter Code : ");
		int code = scan.nextInt();
		System.out.print("Enter Salary : ");
		float salary = scan.nextFloat();
		System.out.print("Enter Project Code : ");
		long projectCode = scan.nextLong();
		
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Code : " + code);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Project Code : " + projectCode);
	
	}

}
