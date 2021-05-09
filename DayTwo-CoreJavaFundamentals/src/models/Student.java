package models;

import java.util.Scanner;

class Student {
	
	private int id;
	private String name;
	Scanner scan = new Scanner(System.in);
	
	protected void acceptDetails() {
		System.out.print("Enter Id : ");
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Name : ");
		this.name = scan.nextLine();
	}
	
	protected void displayDetails() {
		System.out.println("Student Id : " + this.id);
		System.out.println("Student Name : " + this.name);
	}
	
}