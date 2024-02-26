package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		Student student2 = service.addStudent(student);
		
		return new ResponseEntity<>(student2,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getStudent")
	public ResponseEntity <List<Student>>  getStudent()
	{
		List<Student> student = service.getStudent();
		
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
}
