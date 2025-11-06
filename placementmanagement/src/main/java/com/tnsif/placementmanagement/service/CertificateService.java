package com.tnsif.placementmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.repository.CertificateRepository;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repo;

    public List<Certificate> listAll() {
        return repo.findAll();
    }

    public void save(Certificate c) {
        repo.save(c);
    }

    public Certificate get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public void update(Certificate c) {
        repo.save(c);
    }
}
