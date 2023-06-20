package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Campus;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.CampusService;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/campus")

public class CampusController {
    @Autowired
    private CampusService service;

    @GetMapping("/Campus")
    public List<Campus> fetchAllCampus(){
        return  service.fetchCampus();
    }
    @GetMapping("/Campus/{campusId}")
    public Campus fetchById(@PathVariable Long campusId){
        return service.getCampusById(campusId);
    }
    @PostMapping("/campus")
    public  Campus newCampus(@RequestBody Campus campus){
        return service.newCampus(campus);
    }
    @DeleteMapping("/Campus/{campusId}")
    public String deleteById(@PathVariable Long campusId){
        return service.deleteCampus(campusId);
    }


}

