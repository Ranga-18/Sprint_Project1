package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String type;
    private String password;

    public User() {}
    public User(int id, String name, String type, String password) {
        this.id = id;
        this.name = name;
        this.type = type;
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
	public Object getType() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public void setType(Object type2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}
}
