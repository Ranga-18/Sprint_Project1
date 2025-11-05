package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.service.CertificateService;
import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @GetMapping
    public List<Certificate> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody Certificate c) {
        service.save(c);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificate> get(@PathVariable Integer id) {
        try {
            Certificate cert = service.get(id);
            return new ResponseEntity<>(cert, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificate> update(@PathVariable Integer id, @RequestBody Certificate updated) {
        try {
            Certificate existing = service.get(id);
            existing.setYear(updated.getYear());
            existing.setCollegeName(updated.getCollegeName());
            service.update(existing);
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
