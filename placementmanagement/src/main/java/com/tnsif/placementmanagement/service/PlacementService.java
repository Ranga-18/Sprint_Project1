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

    public List<Placement> listAll() { return repo.findAll(); }
    public void save(Placement p) { repo.save(p); }
    public Placement get(Integer id) { return repo.findById(id).get(); }
    public void delete(Integer id) { repo.deleteById(id); }
    public void update(Placement p) { repo.save(p); }
}
