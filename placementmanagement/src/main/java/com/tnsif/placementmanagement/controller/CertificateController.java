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
    public void add(@RequestBody Certificate certificate) {
        service.save(certificate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificate> get(@PathVariable Integer id) {
        try {
            Certificate certificate = service.get(id);
            return new ResponseEntity<>(certificate, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificate> update(@PathVariable Integer id, @RequestBody Certificate updateCert) {
        try {
            Certificate exist = service.get(id);
            exist.setCertificateName(updateCert.getCertificateName());
            exist.setIssueDate(updateCert.getIssueDate());
            exist.setExpiryDate(updateCert.getExpiryDate());
            exist.setStudentName(updateCert.getStudentName());
            exist.setCollegeName(updateCert.getCollegeName());
            service.update(exist);
            return new ResponseEntity<>(exist, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
