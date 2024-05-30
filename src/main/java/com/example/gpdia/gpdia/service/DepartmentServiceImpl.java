package com.example.gpdia.gpdia.service;

import com.example.gpdia.gpdia.entity.Department;
import com.example.gpdia.gpdia.respository.DepartmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRespository departmentRespository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRespository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRespository.findAll();
    }

    @Override
    public Department fetchDepartmentbyid(Long departmentId) {
        return departmentRespository.findById(departmentId).get();
    }

    @Override
    public void deletebyid(Long departmentId) {
        departmentRespository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentid, Department department) {
        Department depDb = departmentRespository.findById(departmentid).get();
        if(Objects.nonNull(department.getDepartmentname()) && !"".equalsIgnoreCase(department.getDepartmentname())){
            depDb.setDepartmentname(department.getDepartmentname());
        }
        return departmentRespository.save(department);
    }

    @Override
    public Department fetchbynames(String departmentname) {
        return departmentRespository.findByDepartmentnameIgnoreCase(departmentname);
    }
}
