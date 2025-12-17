package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entitiy.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.postStudent(st);
    }
}