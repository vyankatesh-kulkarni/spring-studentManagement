package com.demo.student.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.student.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudentList() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<Student> theQuery = session.createQuery("from Student",Student.class);
		
		List<Student> studentList = theQuery.getResultList();
		
		return studentList;
	}

	@Override
	public void saveStudent(Student theStudent) {
		Session session = sessionFactory.getCurrentSession();
		session.save(theStudent);
	}

}
