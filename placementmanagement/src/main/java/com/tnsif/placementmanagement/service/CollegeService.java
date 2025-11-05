package com.tnsif.placementmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository repo;

    // Retrieve all colleges
    public List<College> listAll() {
        return repo.findAll();
    }

    // Save a new college
    public void save(College c) {
        repo.save(c);
    }

    // Get a specific college
    public College get(Integer id) {
        return repo.findById(id).get();
    }

    // Delete a college
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    // Update college
    public void update(College c) {
        repo.save(c);
    }
}
