package com.example.demo.entity;
import java.time.LocalDate;
public class Student{
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public Long setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
    }
    public String getDept(){
        return dept;
    }
    public String setDept(String dept){
        this.dept=dept;
    }
    public LocalDate getDob(){
        return dob;
    }
    public Long setDob(LocalDate dob){
        this.dob=dob;
    }
    public float getCgpa(){
        return cgpa;
    }
    public float setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
}