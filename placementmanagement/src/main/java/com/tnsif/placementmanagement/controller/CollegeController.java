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
    public void add(@RequestBody College c) {
        service.save(c);
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
    public ResponseEntity<College> update(@PathVariable Integer id, @RequestBody College updated) {
        try {
            College existing = service.get(id);
            existing.setName(updated.getName());
            existing.setLocation(updated.getLocation());
            service.update(existing);
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
