package com.demo.student.dao;

import java.util.List;

import com.demo.student.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudentList();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);
}
