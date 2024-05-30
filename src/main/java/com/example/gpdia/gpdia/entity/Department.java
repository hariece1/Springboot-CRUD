package com.example.gpdia.gpdia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    private Long departementID;
    private String departmentname;
    private String departmentcode;

    public Department(Long departementID, String departmentname, String departmentcode) {
        this.departementID = departementID;
        this.departmentname = departmentname;
        this.departmentcode = departmentcode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departementID=" + departementID +
                ", departmentname='" + departmentname + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                '}';
    }

    public Department() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getDepartementID() {
        return departementID;
    }

    public void setDepartementID(Long departementID) {
        this.departementID = departementID;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }
}
