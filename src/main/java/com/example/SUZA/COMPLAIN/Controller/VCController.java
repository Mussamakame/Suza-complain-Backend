package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Model.VC;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import com.example.SUZA.COMPLAIN.Service.VCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/vc")

public class VCController {
    @Autowired
    private VCService service;

    @GetMapping("/VC")
    public List<VC> fetchAllVC(){
        return  service.getVc();
    }
    @GetMapping("/VC/{vcId}")
    public VC fetchById(@PathVariable Long vcId){
        return service.getVcById(vcId);
    }
    @PostMapping("/Vc")
    public  VC newVc(@RequestBody VC vc){
        return service.saveVC(vc);
    }
    @DeleteMapping("/Vc/{vcId}")
    public void delete(Long vcId){
        service.deleteVc(vcId);
    }


}

