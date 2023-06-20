package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Category;
import com.example.SUZA.COMPLAIN.Model.Dean;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Repository.CategoryRepository;
import com.example.SUZA.COMPLAIN.Repository.DeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
@Service

public class DeanService {
    @Autowired
    private DeanRepository repository;
    public List<Dean> fetchDean(){
        return repository.findAll();
    }
    public Dean newDean(Dean dean){
        return repository.save(dean);
    }
    public Dean getDeanById(Long deanId){

        return repository.findById(deanId).orElse(null);
    }
    public String deleteDean(Long DeanId){
        repository.deleteById(DeanId);
        return "dean deleted successful"+DeanId;
    }
    public Dean updateDean( Dean deanDetails) {
        Dean dean = repository.findById(deanDetails.getId()).orElse(null);
        dean.setName(deanDetails.getName());
        dean.setId(deanDetails.getId());
        dean.setPhone(deanDetails.getPhone());
        dean.setEmail(deanDetails.getEmail());
        dean.setDepartment(deanDetails.getDepartment());
        dean.setCampus(deanDetails.getCampus());
        return  repository.save(dean);
    }
}
