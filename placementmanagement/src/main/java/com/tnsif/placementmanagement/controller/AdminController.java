package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.tnsif.placementmanagement.entity.Admin;
import com.tnsif.placementmanagement.service.AdminService;
import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @GetMapping
    public List<Admin> list() { return service.listAll(); }

    @PostMapping
    public void add(@RequestBody Admin a) { service.save(a); }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id) {
        try {
            Admin admin = service.get(id);
            return new ResponseEntity<>(admin, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }

    @PutMapping("/{id}")
    public ResponseEntity<Admin> update(@PathVariable Integer id, @RequestBody Admin updated) {
        try {
            Admin existing = service.get(id);
            existing.setName(updated.getName());
            existing.setPassword(updated.getPassword());
            service.update(existing);
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
