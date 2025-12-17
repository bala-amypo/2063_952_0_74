package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entitiy.Student;
@RestController
public class StudentController{
    @Autowired
    StudentService 
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return 
    }
}