package com.demo.student;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDb
 */
@WebServlet("/Testdb")
public class Testdb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springstudent";
		String pass = "springstudent";
		
		String url = "jdbc:mysql://localhost:3306/web_student_tracker?allowPublicKeyRetrieval=true&useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		Connection con = null;
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database" + url);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			
			out.println("Connection success");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}	
}



