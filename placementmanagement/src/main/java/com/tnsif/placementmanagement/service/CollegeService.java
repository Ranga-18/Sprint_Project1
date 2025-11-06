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

    public List<College> listAll() {
        return repo.findAll();
    }

    public void save(College c) {
        repo.save(c);
    }

    public College get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public void update(College c) {
        repo.save(c);
    }
}
