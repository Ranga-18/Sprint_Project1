package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.tnsif.placementmanagement.entity.Student;
import com.tnsif.placementmanagement.service.StudentService;

import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody Student student) {
        service.save(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student student = service.get(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student updateStudent) {
        try {
            Student exist = service.get(id);
            exist.setStudentName(updateStudent.getStudentName());
            exist.setCourse(updateStudent.getCourse());
            exist.setYear(updateStudent.getYear());
            exist.setCollegeName(updateStudent.getCollegeName());
            exist.setQualification(updateStudent.getQualification());
            service.update(exist);
            return new ResponseEntity<>(exist, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
