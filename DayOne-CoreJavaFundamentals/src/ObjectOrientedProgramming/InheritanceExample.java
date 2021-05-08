package ObjectOrientedProgramming;

import java.util.Scanner;

/**
 * 
 * @author BhawnaGunwani
 *
 * When we create an object of child class, 
 * Memory gets allocated to the data members of 
 * parent class and child class.
 */

class Student {
	
	int id;
	String name;
	Scanner scan = new Scanner(System.in);
	
	public void acceptDetails() {
		System.out.print("Enter Id : ");
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Name : ");
		this.name = scan.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("Student Id : " + this.id);
		System.out.println("Student Name : " + this.name);
	}
	
}

class Marks extends Student {
	
	float objectiveMarks;
	float subjectiveMarks;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println("Subjective Marks : " + this.subjectiveMarks);
	}

}


public class InheritanceExample {
	
	public static void main(String[] args) {
		
		/*
		Student obj = new Student();
		obj.acceptDetails();
		obj.displayDetails();
		*/
		
		Marks obj = new Marks();
		obj.acceptDetails();
		obj.displayDetails();
		
		
	}

}
