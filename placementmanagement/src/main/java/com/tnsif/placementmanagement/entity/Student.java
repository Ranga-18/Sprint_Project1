package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false)
    private String collegeName;

    @Column(nullable = false)
    private String qualification;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private double percentage;

    public Student() {}

    public Student(String studentName, String collegeName, String qualification, String course, int year, double percentage) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.qualification = qualification;
        this.course = course;
        this.year = year;
        this.percentage = percentage;
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeName=" + collegeName +
               ", qualification=" + qualification + ", course=" + course + ", year=" + year +
               ", percentage=" + percentage + "]";
    }
}
