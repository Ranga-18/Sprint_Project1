package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;

    @Column(nullable = false)
    private String collegeName;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String dean;

    @Column(nullable = false)
    private String contactNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String accreditation;

    public College() {}

    public College(String collegeName, String location, String dean, String contactNumber, String email, String accreditation) {
        this.collegeName = collegeName;
        this.location = location;
        this.dean = dean;
        this.contactNumber = contactNumber;
        this.email = email;
        this.accreditation = accreditation;
    }

    // Getters and Setters
    public int getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDean() {
        return dean;
    }
    public void setDean(String dean) {
        this.dean = dean;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAccreditation() {
        return accreditation;
    }
    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    @Override
    public String toString() {
        return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location +
               ", dean=" + dean + ", contactNumber=" + contactNumber + ", email=" + email + 
               ", accreditation=" + accreditation + "]";
    }

	public Object getPrincipalName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrincipalName(Object principalName) {
		// TODO Auto-generated method stub
		
	}

	public void setPhone(Object phone) {
		// TODO Auto-generated method stub
		
	}
}
