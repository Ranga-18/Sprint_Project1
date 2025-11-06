package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    
    @Column(nullable = false)
    private String adminName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String contactNumber;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String department;

    public Admin() {
    }

    public Admin(String adminName, String email, String password, String contactNumber, String role, String department) {
        this.adminName = adminName;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.role = role;
        this.department = department;
    }

    // Getters and Setters
    public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", email=" + email +
               ", contactNumber=" + contactNumber + ", role=" + role + ", department=" + department + "]";
    }

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPhone(Object phone) {
		// TODO Auto-generated method stub
		
	}
}
