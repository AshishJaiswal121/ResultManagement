package com.minor.project.mca.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.minor.project.mca.Bean.GrandTotal;
import com.minor.project.mca.Bean.PracticalMarks;
import com.minor.project.mca.Bean.RemarkStatus;
import com.minor.project.mca.Bean.StudentResultRecord;
import com.minor.project.mca.services.StudentLoginService;

@Controller
public class StudentController {
	@Autowired
	StudentLoginService studentLoginService;

	@GetMapping("/studentLogin")
	public String homePage(Model model) {

		return "StudentLogin";
	}

	@PostMapping("/studentLoginCheck")
	public String studentLogin(Model model, @RequestParam("rollno") String rollno, @RequestParam("dob") String dob,
			HttpSession session) {
		StudentResultRecord studentResultRecord = studentLoginService.checkStudentLogin(rollno, dob);
		if (studentResultRecord != null) {
			model.addAttribute("studentResultRecord", studentResultRecord);
			PracticalMarks practicalMarks = new PracticalMarks();
			PracticalMarks allPracticalMarks = practicalMarks.giveAllPracticalMarks(practicalMarks);
			GrandTotal grandTotal = new GrandTotal();
			GrandTotal grandTotal2 = grandTotal.giveGrandTotal(grandTotal, studentResultRecord, allPracticalMarks);
			model.addAttribute("allPracticalMarks", allPracticalMarks);
			model.addAttribute("grandTotal", grandTotal2);
			RemarkStatus remarkStatus = new RemarkStatus();
			remarkStatus.setMathsPass(remarkStatus.mathsStatus(grandTotal.getMathsTotal()));
			remarkStatus.setPhysicsPass(remarkStatus.physicsStatus(grandTotal.getPhysicsTotal()));
			remarkStatus.setChemistryPass(remarkStatus.chemistryStatus(grandTotal.getChemistryTotal()));
			remarkStatus.setHindiPass(remarkStatus.hindiStatus(grandTotal.getHindiTotal()));
			remarkStatus.setEnglishPass(remarkStatus.englishStatus(grandTotal.getEnglishTotal()));
			model.addAttribute("remarkStatus", remarkStatus);
			if (grandTotal2.getGrandTotal() > 200) {
				String total = "Pass";
				model.addAttribute("total", total);
			} else {
				String total = "Fail";
				model.addAttribute("total", total);
			}

			return "ResultDisplay";
		} else

		{
			session.setAttribute("notFound", "invalid RollNo or Date of Birth");
			return "StudentLogin";
		}
	}
}