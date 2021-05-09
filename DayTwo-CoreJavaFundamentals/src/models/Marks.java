package models;

class Marks extends Student {
	
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	protected void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}
	
	protected void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println("Subjective Marks : " + this.subjectiveMarks);
	}

}