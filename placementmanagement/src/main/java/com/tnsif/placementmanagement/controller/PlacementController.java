package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.service.PlacementService;

import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/placement")
public class PlacementController {

    @Autowired
    private PlacementService service;

    @GetMapping
    public List<Placement> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody Placement placement) {
        service.save(placement);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
            Placement placement = service.get(id);
            return new ResponseEntity<>(placement, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement updatePlacement) {
        try {
            Placement exist = service.get(id);
            exist.setCompanyName(updatePlacement.getCompanyName());
            exist.setDate(updatePlacement.getDate());
            exist.setQualification(updatePlacement.getQualification());
            exist.setYear(updatePlacement.getYear());
            exist.setStudentName(updatePlacement.getStudentName());
            exist.setCollegeName(updatePlacement.getCollegeName());
            service.update(exist);
            return new ResponseEntity<>(exist, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
