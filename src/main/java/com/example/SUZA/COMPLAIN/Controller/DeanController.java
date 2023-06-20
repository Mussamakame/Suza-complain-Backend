package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Dean;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.DeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/dean")

public class DeanController {
    @Autowired
    private DeanService service;

    @GetMapping("/get")
    public List<Dean> fetchAllDean(){
        return  service.fetchDean();
    }
    @GetMapping("/get/{deanId}")
    public Dean fetchById(@PathVariable Long DeanId, Long deanId){
        return service.getDeanById(deanId);
    }
    @PostMapping("/add")
    public  Dean newDean(@RequestBody Dean dean){
        return service.newDean(dean);
    }
    @DeleteMapping("/delete/{deanId}")
    public String delete(Long deanId){
        return service.deleteDean(deanId);
    }
}

