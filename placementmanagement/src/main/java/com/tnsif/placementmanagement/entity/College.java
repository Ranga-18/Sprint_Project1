package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class College {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;
    private String location;

    public College() {}
    public College(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    // Getters and Setters
	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLocation(Object location2) {
		// TODO Auto-generated method stub
		
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
}
