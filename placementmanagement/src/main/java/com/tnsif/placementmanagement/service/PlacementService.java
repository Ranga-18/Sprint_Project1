package com.tnsif.placementmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // Get all placement records
    public List<Placement> listAll() {
        return repo.findAll();
    }

    // Save a new placement
    public void save(Placement p) {
        repo.save(p);
    }

    // Get a specific placement by ID
    public Placement get(Integer pid) {
        return repo.findById(pid).get();
    }

    // Delete a placement record
    public void delete(Integer pid) {
        repo.deleteById(pid);
    }

    // Update placement record
    public void update(Placement p) {
        repo.save(p);
    }
}
