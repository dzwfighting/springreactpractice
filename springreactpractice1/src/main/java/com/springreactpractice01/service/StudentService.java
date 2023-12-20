package com.springreactpractice01.service;

import com.springreactpractice01.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
