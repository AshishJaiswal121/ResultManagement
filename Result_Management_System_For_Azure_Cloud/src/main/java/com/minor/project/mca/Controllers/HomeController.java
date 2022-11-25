package com.minor.project.mca.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.minor.project.mca.Bean.Teacher;
import com.minor.project.mca.services.TeacherLoginService;

@Controller
public class HomeController {
	@Autowired
	TeacherLoginService teacherLoginService;

	@GetMapping("/")
	public String homePage(Model model) {
		Teacher teacher = new Teacher();
		model.addAttribute("teacher", teacher);
		return "HomePage";
	}

	@PostMapping("/teacherLogin")
	public String teacherLogin(@ModelAttribute("teacher") Teacher teacher, HttpSession session, Model model) {
		boolean result = teacherLoginService.teacherLoginCheck(teacher);
		if (result == true)
			return "redirect:/back";
		else {
			model.addAttribute("teacher", teacher);
			session.setAttribute("notFound", "invalid Email or Password");
			return "HomePage";
		}
	}
}
