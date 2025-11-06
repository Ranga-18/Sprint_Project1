package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int certificateId;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false)
    private String collegeName;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private String yearOfPassing;

    @Column(nullable = false)
    private String grade;

    @Column(nullable = false)
    private String certificateNumber;

    public Certificate() {}

    public Certificate(String studentName, String collegeName, String course, String yearOfPassing, String grade, String certificateNumber) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.course = course;
        this.yearOfPassing = yearOfPassing;
        this.grade = grade;
        this.certificateNumber = certificateNumber;
    }

    // Getters and Setters
    public int getCertificateId() { return certificateId; }
    public void setCertificateId(int certificateId) { this.certificateId = certificateId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public String getYearOfPassing() { return yearOfPassing; }
    public void setYearOfPassing(String yearOfPassing) { this.yearOfPassing = yearOfPassing; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
    public String getCertificateNumber() { return certificateNumber; }
    public void setCertificateNumber(String certificateNumber) { this.certificateNumber = certificateNumber; }

    @Override
    public String toString() {
        return "Certificate [certificateId=" + certificateId + ", studentName=" + studentName +
               ", collegeName=" + collegeName + ", course=" + course + ", yearOfPassing=" + yearOfPassing +
               ", grade=" + grade + ", certificateNumber=" + certificateNumber + "]";
    }

	public Object getCertificateName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getIssueDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCertificateName(Object certificateName) {
		// TODO Auto-generated method stub
		
	}

	public void setIssueDate(Object issueDate) {
		// TODO Auto-generated method stub
		
	}

	public void setExpiryDate(Object expiryDate) {
		// TODO Auto-generated method stub
		
	}
}
