package com.tnsif.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.tnsif.placementmanagement.entity.User;
import com.tnsif.placementmanagement.service.UserService;
import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody User u) {
        service.save(u);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = service.get(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User updated) {
        try {
            User existing = service.get(id);
            existing.setName(updated.getName());
            existing.setType(updated.getType());
            existing.setPassword(updated.getPassword());
            service.update(existing);
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
