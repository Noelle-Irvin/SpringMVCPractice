package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Students;
import com.example.demo.service.StudentsService;

@RestController
public class StudentController {
	
	@Autowired
	StudentsService service;
	
	@RequestMapping("/students")
	public List<Students> getStudents() {
		return service.getAllStudents();
	}
	
	@RequestMapping("/reverse")
	public List<Students> getReverseStudents() {
		return service.getReverseStudents(); 
	}

}
