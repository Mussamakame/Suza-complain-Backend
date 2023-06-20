package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Staff;
import com.example.SUZA.COMPLAIN.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired
    private StaffService service;

    @GetMapping("/get")
    public List<Staff> fetchAllStaff(Staff staff){
        return  service.getStaff(staff);
    }
    @GetMapping("/get/{staffId}")
    public Staff fetchById(@PathVariable Long staffId){
        return service.getStaffById(staffId);
    }
    @PostMapping("/add")
    public  Staff newStaff(@RequestBody Staff staff){
        return service.saveStaff(staff);
    }
    @DeleteMapping("/delete/{staffId}")
    public void delete(Long staffId){
        service.deleteStaff(staffId);
    }
}

