package com.bootcamp.students.controller;

import com.bootcamp.students.model.Student;
import com.bootcamp.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudentList();
    }


}