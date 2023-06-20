package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Dvc;
import com.example.SUZA.COMPLAIN.Repository.DvcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DvcService {

    @Autowired
    private DvcRepository repository;

    public List<Dvc> fetchDvc(){
        return repository.findAll();
    }
    public Dvc newDvc(Dvc dvc){
        return repository.save(dvc);
    }

    public Dvc getDvcById(Long dvcId){
        return repository.findById(dvcId).orElse(null);
    }

    public String deleteDvc(Long dvcId){
        repository.deleteById(dvcId);
        return "dvc deleted successful"+dvcId;
    }

    public Dvc updateDvc(Dvc dvc){
        Dvc dvc1 = repository.findById(dvc.getId()).orElse(null);
        dvc1.setName(dvc.getName());
        dvc1.setId (dvc.getId());
        dvc1.setCategory(dvc.getCategory());
        dvc1.setEmail(dvc.getEmail());
        dvc1.setPhone(dvc.getPhone());
        return  this.repository.save(dvc1);
    }
}
