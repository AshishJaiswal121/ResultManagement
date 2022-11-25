package com.minor.project.mca.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.minor.project.mca.Bean.StudentResultRecord;
import com.minor.project.mca.services.StudentResultRecordService;
import com.minor.project.mca.services.TeacherLoginService;

@Controller
public class TeacherCrudController {
	@Autowired
	TeacherLoginService teacherLoginService;
	@Autowired
	StudentResultRecordService studentResultRecordService;

	@GetMapping("/addRecord")
	public String addRecord(Model model) {
		StudentResultRecord studentResultRecord = new StudentResultRecord();
		model.addAttribute(studentResultRecord);
		return "AddRecord";
	}

	@GetMapping("/back")
	public String back(Model model) {
		List<StudentResultRecord> studentResultRecords = studentResultRecordService.getAllStudentRecords();
		model.addAttribute("studentResultRecords", studentResultRecords);
		return "allReacordsByTeacher";

	}

	@GetMapping("/deleteRecord/{id}")
	public String deleteRecord(@PathVariable int id, Model model) {

		studentResultRecordService.deleteResultRecord(id);
		List<StudentResultRecord> studentResultRecords = studentResultRecordService.getAllStudentRecords();
		model.addAttribute("studentResultRecords", studentResultRecords);
		return "allReacordsByTeacher";

	}

	@GetMapping("/editRecord/{id}")
	public String editRecord(@PathVariable int id, Model model) {

		StudentResultRecord studentResultRecord = studentResultRecordService.findResultRecordById(id);
		if (studentResultRecord != null) {
			model.addAttribute("studentResultRecord", studentResultRecord);
			return "AddRecord";
		} else {
			List<StudentResultRecord> studentResultRecords = studentResultRecordService.getAllStudentRecords();
			model.addAttribute("studentResultRecords", studentResultRecords);
			return "redirect:/back";
		}

	}

	@PostMapping("/saveRecord")
	public String saveRecord(Model model,
			@ModelAttribute("studentResultRecord") StudentResultRecord studentResultRecord) {

		StudentResultRecord studentResultRecords = studentResultRecordService
				.findResultRecordById(studentResultRecord.getId());
		if (studentResultRecords != null) {
			studentResultRecords.setChemistry(studentResultRecord.getChemistry());
			studentResultRecords.setPhysics(studentResultRecord.getPhysics());
			studentResultRecords.setDob(studentResultRecord.getDob());
			studentResultRecords.setEnglish(studentResultRecord.getEnglish());
			studentResultRecords.setHindi(studentResultRecord.getHindi());
			studentResultRecords.setMaths(studentResultRecord.getMaths());
			studentResultRecords.setRollno(studentResultRecord.getRollno());
			studentResultRecords.setName(studentResultRecord.getName());
			studentResultRecordService.saveStudentRecord(studentResultRecords);
			return "redirect:/back";
		} else {
			System.out.println(studentResultRecord);
			boolean result = studentResultRecordService.saveStudentRecord(studentResultRecord);
			if (result == true) {
				List<StudentResultRecord> studentResultRecordNew = studentResultRecordService.getAllStudentRecords();
				model.addAttribute("studentResultRecords", studentResultRecordNew);
				return "redirect:/back";
			}
			return "AddRecord";
		}
	}

}
