package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "qualification", nullable = false)
    private String qualification;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "college_name", nullable = false)
    private String collegeName;

    // ✅ Constructors
    public Placement() {
    }

    public Placement(String companyName, LocalDate date, String qualification, int year, String studentName, String collegeName) {
        this.companyName = companyName;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    // ✅ Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Placement [id=" + id + ", companyName=" + companyName + ", date=" + date + 
               ", qualification=" + qualification + ", year=" + year + 
               ", studentName=" + studentName + ", collegeName=" + collegeName + "]";
    }
}
