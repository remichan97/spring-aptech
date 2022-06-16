package com.aptech.lab4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aptech.lab4.model.Student;

@Controller
public class StudentController {
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("sv", new Student());
		return "index";
	}

	@PostMapping("/XuLy")
	public String xuLyData(@ModelAttribute(name = "sv") @Valid Student std, BindingResult err, Model model) {

		// if a field is blank, error out
		if (err.hasErrors()) {
			// by error out, we mean return to the index page
			return "index";
		}

		model.addAttribute("sinhVien", std);

		// return a view name
		return "show";
	}
}
