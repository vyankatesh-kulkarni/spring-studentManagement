package com.demo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.student.entity.Student;
import com.demo.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/list")
	public String getStudentList(Model model) {
		List<Student> studentList = studentService.getStudentList();
		model.addAttribute("studentList", studentList);
		return "student-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "add-student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		studentService.saveStudent(theStudent);
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model model) {
		
		//get student from db
		Student theStudent = studentService.getStudent(theId);
		
		// bind it to model attribute and return
		model.addAttribute("student", theStudent);
		return "add-student-form";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentId") int theId) {
		studentService.deleteStudent(theId);
		
		return "redirect:/student/list";
	}
}



