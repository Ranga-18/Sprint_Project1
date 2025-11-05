package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementmanagement.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {}
