package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Staff;
import com.example.SUZA.COMPLAIN.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;
    public Staff saveStaff(Staff staff){
        return repository.save(staff);

    }
    public List<Staff> saveStaff(List<Staff> staff){
        return repository.saveAll(staff);
    }
    public List<Staff> getStaff(Staff staff){
        return repository.findAll();
    }
    public Staff getStaffById(Long Id){
        return repository.findById(Id).orElse(null);

    }
    public void deleteStaff(Long Id){

        repository.findById(Id);
    }
}
