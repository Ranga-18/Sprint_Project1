package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.service.CollegeService;

import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService service;

    @GetMapping
    public List<College> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody College college) {
        service.save(college);
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> get(@PathVariable Integer id) {
        try {
            College college = service.get(id);
            return new ResponseEntity<>(college, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<College> update(@PathVariable Integer id, @RequestBody College updateCollege) {
        try {
            College exist = service.get(id);
            exist.setCollegeName(updateCollege.getCollegeName());
            exist.setLocation(updateCollege.getLocation());
            exist.setPrincipalName(updateCollege.getPrincipalName());
            exist.setEmail(updateCollege.getEmail());
            exist.setPhone(updateCollege.getPhone());
            service.update(exist);
            return new ResponseEntity<>(exist, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
