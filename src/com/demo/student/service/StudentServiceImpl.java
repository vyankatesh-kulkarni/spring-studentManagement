package com.demo.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.student.dao.StudentDAO;
import com.demo.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	@Transactional
	@Override
	public List<Student> getStudentList() {
		List<Student> studentList = studentDAO.getStudentList();
		return studentList;
	}

}
