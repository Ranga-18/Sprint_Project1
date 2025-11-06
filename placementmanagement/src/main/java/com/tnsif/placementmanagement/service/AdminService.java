package com.tnsif.placementmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementmanagement.entity.Admin;
import com.tnsif.placementmanagement.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public List<Admin> listAll() {
        return repo.findAll();
    }

    public void save(Admin a) {
        repo.save(a);
    }

    public Admin get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public void update(Admin a) {
        repo.save(a);
    }
}
