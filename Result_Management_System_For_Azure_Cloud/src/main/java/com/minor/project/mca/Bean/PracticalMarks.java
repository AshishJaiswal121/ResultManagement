package com.minor.project.mca.Bean;

public class PracticalMarks {
	private int mathsMarks;
	private int physicsMarks;
	private int chemistryMarks;
	private int hindiMarks;
	private int englishMarks;
	private int grandTotal;

	public PracticalMarks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PracticalMarks(int grandTotal) {
		super();
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "PracticalMarks [mathsMarks=" + mathsMarks + ", physicsMarks=" + physicsMarks + ", chemistryMarks="
				+ chemistryMarks + ", hindiMarks=" + hindiMarks + ", englishMarks=" + englishMarks + ", grandTotal="
				+ grandTotal + "]";
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public PracticalMarks giveAllPracticalMarks(PracticalMarks practicalMarks) {
		int max = 20;
		int min = 12;
		practicalMarks.setChemistryMarks((int) (Math.random() * (max - min + 1) + min));
		practicalMarks.setPhysicsMarks((int) (Math.random() * (max - min + 1) + min));
		practicalMarks.setMathsMarks((int) (Math.random() * (max - min + 1) + min));
		practicalMarks.setHindiMarks((int) (Math.random() * (max - min + 1) + min));
		practicalMarks.setEnglishMarks((int) (Math.random() * (max - min + 1) + min));
		return practicalMarks;
	}

}
