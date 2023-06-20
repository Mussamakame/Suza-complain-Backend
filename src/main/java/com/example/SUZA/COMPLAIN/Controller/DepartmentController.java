package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Department;
import com.example.SUZA.COMPLAIN.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/department")

public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("/get")
    public List<Department> fetchAllDepartment(){
        return  service.fetchDepartment();
    }
    @GetMapping("/get/{departmentId}")
    public Department fetchById(@PathVariable Long DepartmentId){
        return service.getDepartmentById(DepartmentId);
    }
    @PostMapping("/add")
    public  Department newDepartment(@RequestBody Department department){
        return service.newDepartment(department);
    }
    @DeleteMapping("/delete/{departmentId}")
    public String delete(Long departmentId){
        return service.deleteDepartment(departmentId);
    }
}

