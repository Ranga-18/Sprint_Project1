package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @Column(name = "student_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "college")
    private String college;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "course")
    private String course;

    @Column(name = "year")
    private int year;

    @Column(name = "certificate_id")
    private int certificateId;

    public Student() {}

    public Student(int id, String name, String college, String qualification, String course, int year, int certificateId) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.qualification = qualification;
        this.course = course;
        this.year = year;
        this.certificateId = certificateId;
    }

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCollege() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCourse() {
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

	public Object getCertificateId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCertificateId(Object certificateId2) {
		// TODO Auto-generated method stub
		
	}

	public void setQualification(Object qualification2) {
		// TODO Auto-generated method stub
		
	}

	public void setYear(Object year2) {
		// TODO Auto-generated method stub
		
	}

	public void setCourse(Object course2) {
		// TODO Auto-generated method stub
		
	}

	public void setCollege(Object college2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters...
}
