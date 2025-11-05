package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.service.PlacementService;

import jakarta.persistence.NoResultException;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService service;

    @GetMapping("/placement")
    public List<Placement> list() {
        return service.listAll();
    }

    @PostMapping("/placement")
    public void add(@RequestBody Placement placement) {
        service.save(placement);
    }

    @GetMapping("/placement/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
            Placement placement = service.get(id);
            return new ResponseEntity<Placement>(placement, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/placement/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/placement/{id}")
    public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement updatedPlacement) {
        try {
            Placement existingPlacement = service.get(id);
            existingPlacement.setCompanyName(updatedPlacement.getCompanyName());
            existingPlacement.setStudentName(updatedPlacement.getStudentName());
            existingPlacement.setRole(updatedPlacement.getRole());
            existingPlacement.setPackageOffered(updatedPlacement.getPackageOffered());
            service.update(existingPlacement);
            return new ResponseEntity<Placement>(existingPlacement, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }
}
