package com.example.gpdia.gpdia.respository;

import com.example.gpdia.gpdia.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends JpaRepository<Department,Long> {
    public Department findByDepartmentname(String departmentname);
    public Department findByDepartmentnameIgnoreCase(String departmentname);
}
