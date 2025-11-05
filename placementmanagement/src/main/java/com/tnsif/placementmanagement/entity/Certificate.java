package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
    @Id
    private int id;
    private String year;
    private String collegeName;

    public Certificate() {}
    public Certificate(int id, String year, String collegeName) {
        this.id = id;
        this.year = year;
        this.collegeName = collegeName;
    }
    // Getters and Setters
	public Object getYear() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCollegeName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCollegeName(Object collegeName2) {
		// TODO Auto-generated method stub
		
	}
	public void setYear(Object year2) {
		// TODO Auto-generated method stub
		
	}
}
