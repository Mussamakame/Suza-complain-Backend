package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Staff;
import com.example.SUZA.COMPLAIN.Model.VC;
import com.example.SUZA.COMPLAIN.Repository.VCRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class VCService {

    @Autowired
    public VCRepository repository;

    public VC saveVC(VC vc){
        return repository.save(vc);
    }
    public List<VC> saveVc(List<VC> vc){
        return repository.saveAll(vc);
    }
    public List<VC> getVc(){
        return repository.findAll();

    }
   public VC getVcById(long Id){

        return this.repository.findVcById(Id);
   }
    public void deleteVc(Long vcId) {
        repository.findById(vcId);
    }
    }

