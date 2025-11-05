package com.tnsif.placementmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Placement {

    @Id
    @Column(name = "P_id")
    private int p_id;

    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "Student_Name")
    private String studentName;

    @Column(name = "Role")
    private String role;

    @Column(name = "Package_Offered")
    private double packageOffered;

    public Placement() {
        super();
    }

    public Placement(int p_id, String companyName, String studentName, String role, double packageOffered) {
        super();
        this.p_id = p_id;
        this.companyName = companyName;
        this.studentName = studentName;
        this.role = role;
        this.packageOffered = packageOffered;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(double packageOffered) {
        this.packageOffered = packageOffered;
    }

    @Override
    public String toString() {
        return "Placement [p_id=" + p_id + ", companyName=" + companyName + ", studentName=" + studentName
                + ", role=" + role + ", packageOffered=" + packageOffered + "]";
    }
}
