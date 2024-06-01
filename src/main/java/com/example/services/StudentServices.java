package com.example.services;

import java.util.List;

import com.example.entities.Student;

public interface StudentServices {
	
	String addStudent(Student st);
	
	List<Student> fetchAllStudents();
	
	Student searchStudent(int univId);
	
	String updateStudent(Student st);
	
	String deleteStudent(int univId);

}
