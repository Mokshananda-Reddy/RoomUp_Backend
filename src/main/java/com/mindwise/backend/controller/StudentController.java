package com.roomup.backend.controller;

import com.roomup.backend.model.Student;
import com.roomup.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    Student newPatient(@RequestBody Student newStudent)
    {
        return studentRepository.save(newStudent);
    }

    @GetMapping("/students")
    List<Student> getAllPatients()
    {
        // return "Hello World";
        return studentRepository.findAll();
    }

}
