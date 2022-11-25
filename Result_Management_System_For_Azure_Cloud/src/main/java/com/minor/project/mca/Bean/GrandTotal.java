package com.minor.project.mca.Bean;

public class GrandTotal {
	private int mathsTotal;
	private int physicsTotal;
	private int chemistryTotal;
	private int hindiTotal;
	private int englishTotal;
	private int grandTotal;

	public GrandTotal(int mathsTotal, int physicsTotal, int chemistryTotal, int hindiTotal, int englishTotal,
			int grandTotal) {
		super();
		this.mathsTotal = mathsTotal;
		this.physicsTotal = physicsTotal;
		this.chemistryTotal = chemistryTotal;
		this.hindiTotal = hindiTotal;
		this.englishTotal = englishTotal;
		this.grandTotal = grandTotal;
	}

	public GrandTotal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GrandTotal [mathsTotal=" + mathsTotal + ", physicsTotal=" + physicsTotal + ", chemistryTotal="
				+ chemistryTotal + ", hindiTotal=" + hindiTotal + ", englishTotal=" + englishTotal + ", grandTotal="
				+ grandTotal + "]";
	}

	public int getMathsTotal() {
		return mathsTotal;
	}

	public void setMathsTotal(int mathsTotal) {
		this.mathsTotal = mathsTotal;
	}

	public int getPhysicsTotal() {
		return physicsTotal;
	}

	public void setPhysicsTotal(int physicsTotal) {
		this.physicsTotal = physicsTotal;
	}

	public int getChemistryTotal() {
		return chemistryTotal;
	}

	public void setChemistryTotal(int chemistryTotal) {
		this.chemistryTotal = chemistryTotal;
	}

	public int getHindiTotal() {
		return hindiTotal;
	}

	public void setHindiTotal(int hindiTotal) {
		this.hindiTotal = hindiTotal;
	}

	public int getEnglishTotal() {
		return englishTotal;
	}

	public void setEnglishTotal(int englishTotal) {
		this.englishTotal = englishTotal;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public GrandTotal giveGrandTotal(GrandTotal grandTotal2, StudentResultRecord studentResultRecord,
			PracticalMarks allPracticalMarks) {
		grandTotal2.setChemistryTotal(studentResultRecord.getChemistry() + allPracticalMarks.getChemistryMarks());
		grandTotal2.setPhysicsTotal(studentResultRecord.getPhysics() + allPracticalMarks.getPhysicsMarks());
		grandTotal2.setMathsTotal(studentResultRecord.getMaths() + allPracticalMarks.getMathsMarks());
		grandTotal2.setHindiTotal(studentResultRecord.getHindi() + allPracticalMarks.getHindiMarks());
		grandTotal2.setEnglishTotal(studentResultRecord.getEnglish() + allPracticalMarks.getEnglishMarks());
		grandTotal2.setGrandTotal(grandTotal2.getChemistryTotal() + grandTotal2.getPhysicsTotal()
				+ grandTotal2.getMathsTotal() + grandTotal2.getHindiTotal() + grandTotal2.getEnglishTotal());
		return grandTotal2;
	}

}
