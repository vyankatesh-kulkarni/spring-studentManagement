package com.demo.student.service;

import java.util.List;

import com.demo.student.entity.Student;

public interface StudentService {
	
	public List<Student> getStudentList();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);

	public void deleteStudent(int theId);
}
