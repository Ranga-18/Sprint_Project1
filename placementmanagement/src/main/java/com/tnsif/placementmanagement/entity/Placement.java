package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Placement {
    @Id
    private int id;
    @Column(nullable = false)
    private String companyName;
    private String date;
    private String qualification;
    private String year;

    public Placement() {}
    public Placement(int id, String companyName, String date, String qualification, String year) {
        this.id = id;
        this.companyName = companyName;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }
    // Getters and Setters
	public Object getCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getQualification() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getYear() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setYear(Object year2) {
		// TODO Auto-generated method stub
		
	}
	public void setQualification(Object qualification2) {
		// TODO Auto-generated method stub
		
	}
	public void setDate(Object date2) {
		// TODO Auto-generated method stub
		
	}
	public void setCompanyName(Object companyName2) {
		// TODO Auto-generated method stub
		
	}
}
