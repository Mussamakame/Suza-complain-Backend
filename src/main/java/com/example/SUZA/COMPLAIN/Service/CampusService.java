package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Campus;
import com.example.SUZA.COMPLAIN.Model.Category;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Repository.CampusRepository;
import com.example.SUZA.COMPLAIN.Repository.CategoryRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CampusService {
    @Autowired
    private CampusRepository repository;
    public List<Campus> fetchCampus(){
        return repository.findAll();
    }
    public Campus newCampus(Campus campus){
        return repository.save(campus);
    }
    public Campus getCampusById(Long campusId){

        return repository.findById(campusId).orElse(null);
    }
    public String deleteCampus(Long campusId){
        repository.deleteById(campusId);
        return "campus deleted successful"+campusId;
    }
    public Campus updateCampus( Campus campusDetails){
        Campus campus = repository.findById(campusDetails.getId()).orElse(null);
        campus.setLocation(campusDetails.getLocation());
        campus.setName(campusDetails.getName());
        return repository.save(campus);
    }



}
