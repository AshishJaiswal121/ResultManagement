package com.minor.project.mca.Bean;

public class RemarkStatus {
	private String mathsPass;
	private String physicsPass;
	private String chemistryPass;
	private String hindiPass;
	private String englishPass;

	@Override
	public String toString() {
		return "RemarkStatus [mathsPass=" + mathsPass + ", physicsPass=" + physicsPass + ", chemistryPass="
				+ chemistryPass + ", hindiPass=" + hindiPass + ", englishPass=" + englishPass + "]";
	}

	public RemarkStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RemarkStatus(String mathsPass, String physicsPass, String chemistryPass, String hindiPass,
			String englishPass) {
		super();
		this.mathsPass = mathsPass;
		this.physicsPass = physicsPass;
		this.chemistryPass = chemistryPass;
		this.hindiPass = hindiPass;
		this.englishPass = englishPass;
	}

	public String getMathsPass() {
		return mathsPass;
	}

	public void setMathsPass(String mathsPass) {
		this.mathsPass = mathsPass;
	}

	public String getPhysicsPass() {
		return physicsPass;
	}

	public void setPhysicsPass(String physicsPass) {
		this.physicsPass = physicsPass;
	}

	public String getChemistryPass() {
		return chemistryPass;
	}

	public void setChemistryPass(String chemistryPass) {
		this.chemistryPass = chemistryPass;
	}

	public String getHindiPass() {
		return hindiPass;
	}

	public void setHindiPass(String hindiPass) {
		this.hindiPass = hindiPass;
	}

	public String getEnglishPass() {
		return englishPass;
	}

	public void setEnglishPass(String englishPass) {
		this.englishPass = englishPass;
	}

	public String mathsStatus(int mathsTotal) {
		if (mathsTotal >= 33) {
			return "Pass";

		} else {
			return "Supply";
		}
	}

	public String physicsStatus(int physicsTotal) {
		if (physicsTotal >= 33) {
			return "Pass";

		} else {
			return "Supply";
		}
	}

	public String chemistryStatus(int chemistryTotal) {
		if (chemistryTotal >= 33) {
			return "Pass";

		} else {
			return "Supply";
		}
	}

	public String hindiStatus(int hindiTotal) {
		if (hindiTotal >= 33) {
			return "Pass";

		} else {
			return "Supply";
		}
	}

	public String englishStatus(int englishTotal) {
		if (englishTotal >= 33) {
			return "Pass";

		} else {
			return "Supply";
		}
	}

}
