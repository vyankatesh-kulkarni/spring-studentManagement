package com.demo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
