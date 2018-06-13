package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StudentsDao;
import com.example.demo.model.Students;

@Component
public class StudentsService {
	
	@Autowired
	StudentsDao dao;
	
	public List<Students> getAllStudents() {
		return dao.getAllStudents();
	}
	
	public List<Students> getReverseStudents() {
		return dao.getReverseStudents();
	}

}
