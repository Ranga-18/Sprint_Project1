package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String contactNumber;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private boolean active;

    public User() {}

    public User(String username, String password, String email, String contactNumber, String role, boolean active) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.active = active;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", email=" + email +
               ", contactNumber=" + contactNumber + ", role=" + role + ", active=" + active + "]";
    }

	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserName(Object userName2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPhone(Object phone) {
		// TODO Auto-generated method stub
		
	}
}
