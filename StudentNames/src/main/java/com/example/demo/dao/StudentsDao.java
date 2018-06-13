package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Students;


@Component
public class StudentsDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static final String getAllStudents = "SELECT * FROM students";
	private static final String getReverseStudents =  getAllStudents + " ORDER BY firstName DESC";
	
	public List<Students> getAllStudents() {
		return jdbcTemplate.query(getAllStudents, new BeanPropertyRowMapper<>(Students.class));
	}
	
	public List<Students> getReverseStudents() {
		return jdbcTemplate.query(getReverseStudents, new BeanPropertyRowMapper<>(Students.class));
	}

}
