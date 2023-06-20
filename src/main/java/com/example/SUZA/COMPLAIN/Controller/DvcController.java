package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Dvc;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.DvcService;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/dvc" ,consumes = MediaType.APPLICATION_JSON_VALUE)
public class DvcController {
    @Autowired
    private DvcService service;

    @GetMapping("/get")
    public List<Dvc> fetchAllDvc(){
        return  service.fetchDvc();
    }
    @GetMapping("/get/{dvcId}")
    public Dvc fetchById(@PathVariable Long dvcId){
        return service.getDvcById(dvcId);
    }
    @PostMapping("/add")
    public  Dvc newDvc(@RequestBody Dvc dvc){
        return service.newDvc(dvc);
    }
    @DeleteMapping("/delete/{dvcId}")
    public String deleteById(@PathVariable Long dvcId){
        return service.deleteDvc(dvcId);
    }

}

