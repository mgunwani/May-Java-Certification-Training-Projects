package models;

class Sports extends Marks {
	protected float score;
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Score : ");
		this.score = scan.nextFloat();
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Score Obtained : " + this.score);
	}
}

