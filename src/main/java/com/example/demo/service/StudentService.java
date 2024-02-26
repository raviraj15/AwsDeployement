package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public Student addStudent(Student student)
	{
		Student save = studentRepo.save(student);
		
		return save;
		
	}
	
	public List<Student> getStudent()
	{
		 List<Student> all = studentRepo.findAll();
		
		return all;
		
	}
	
}
