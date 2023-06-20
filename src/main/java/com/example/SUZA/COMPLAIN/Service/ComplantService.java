package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Category;
import com.example.SUZA.COMPLAIN.Model.Complant;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Repository.CategoryRepository;
import com.example.SUZA.COMPLAIN.Repository.ComplantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplantService {
    @Autowired
    private ComplantRepository repository;
    public List<Complant> fetchComplant(){
        return repository.findAll();
    }
    public Complant newComplant(Complant complant){
        return repository.save(complant);
    }
    public Complant getComplantById(Long Id){

        return repository.findById(Id).orElse(null);
    }
    public String deleteComplant(Long complantId){
        repository.deleteById(complantId);
        return "category deleted successful"+complantId;
    }
    public Complant updateComplant( Complant complantDetails) {
        Complant complant = repository.findById(complantDetails.getId()).orElse(null);
        complant.setName(complantDetails.getName());
        complant.setCategory(complantDetails.getCategory());
        return this.repository.save(complant);
    }
}
