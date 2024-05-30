package com.example.gpdia.gpdia.service;

import com.example.gpdia.gpdia.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    public Department fetchDepartmentbyid(Long departmentId);

    public void deletebyid(Long departmentId);

    public Department updateDepartment(Long departmentid, Department department);

    Department fetchbynames(String departmentname);
}
