package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Admin {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;

    public Admin() {}
    public Admin(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    // Getters and Setters
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}
}
