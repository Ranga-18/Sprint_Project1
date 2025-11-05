package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tnsif.placementmanagement.entity.Student;
import com.tnsif.placementmanagement.service.StudentService;

import jakarta.persistence.NoResultException;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list() {
        return service.listAll();
    }

    @PostMapping("/students")
    public void add(@RequestBody Student s) {
        service.save(s);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student s = service.get(id);
            return new ResponseEntity<Student>(s, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student updated) {
        try {
            Student exist = service.get(id);
            exist.setName(updated.getName());
            exist.setCollege(updated.getCollege());
            exist.setCourse(updated.getCourse());
            exist.setQualification(updated.getQualification());
            exist.setYear(updated.getYear());
            exist.setCertificateId(updated.getCertificateId());
            service.update(exist);
            return new ResponseEntity<Student>(exist, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }
}
