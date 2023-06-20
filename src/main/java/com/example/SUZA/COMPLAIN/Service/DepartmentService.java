package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Department;
import com.example.SUZA.COMPLAIN.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
        @Autowired
        private DepartmentRepository repository;

        public List<Department> fetchDepartment(){
            return repository.findAll();
        }
        public Department newDepartment(Department department){
            return repository.save(department);
        }
    public Department getDepartmentById(Long departmentId){
        return repository.findById(departmentId).orElse(null);
    }

    public String deleteDepartment(Long departmentId){
        repository.deleteById(departmentId);
        return "department deleted successful"+departmentId;
    }

    public Department updateDeparment( Department departmentDetails){
        Department department = repository.findById(departmentDetails.getId()).orElse(null);
        department.setCampus(departmentDetails.getCampus());
        department.setName(departmentDetails.getName());

        return repository.save(department);
    }
}
