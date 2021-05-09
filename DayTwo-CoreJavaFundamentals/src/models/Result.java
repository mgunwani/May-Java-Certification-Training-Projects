package models;

public class Result extends Sports {
	
	private float totalMarks;
	private float averageMarks;
	
	public void calculate() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks : " + this.totalMarks);
		System.out.println("Average Marks : " + this.averageMarks);
		if(this.objectiveMarks > 70 && this.subjectiveMarks > 70 && this.score > 70) {
			if(this.averageMarks >=75) {
				System.out.println("You are selected for next round.");
			}
			else {
				System.out.println("You are rejected. Try again next time!!");
			}
		} else {
			System.out.println("You are rejected. Try again next time!!");
		}
	}
}