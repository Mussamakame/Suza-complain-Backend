package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Complant;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.ComplantService;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "api/complant")
public class ComplantController {
    @Autowired
    private ComplantService service;

    @GetMapping("/Complant")
    public List<Complant> fetchAllComplant(){
        return  service.fetchComplant();
    }
   @GetMapping("/Complant/{complantId}")
                 public Complant fetchById(@PathVariable Long complantId){
        return service.getComplantById(complantId);
    }
    @PostMapping("/add")
    public  Complant newComplant(@RequestBody Complant complant){
        return service.newComplant(complant);
    }
    @DeleteMapping("/Complant/{complantId}")
    public String delete(Long ComplantId){
        return service.deleteComplant(ComplantId);
    }


}

