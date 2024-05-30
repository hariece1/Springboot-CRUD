package com.example.gpdia.gpdia.Controller;

import com.example.gpdia.gpdia.entity.Department;
import com.example.gpdia.gpdia.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Departmentcontroller {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/savedepartments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/listdepart")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchdepartmentbyid(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentbyid(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deletebyid(@PathVariable("id") Long departmentId){
        departmentService.deletebyid(departmentId);
        return "Done Deleting";
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentid,@RequestBody Department department){
        return departmentService.updateDepartment(departmentid,department);
    }
    @GetMapping("/department/name/{name}")
    public Department fetchbynames(@PathVariable("name") String departmentname){
        return departmentService.fetchbynames(departmentname);
    }
}
