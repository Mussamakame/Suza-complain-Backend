package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/Student")
    public List<Student> fetchAllStudents(){
        return  service.fetchStudents();
    }
    @GetMapping("/Student/{studentRegNo}")
    public Student fetchById(@PathVariable Long studentRegNo){
        return service.getStudentById(studentRegNo);
    }
    @PostMapping("/Student")
    public  Student newStudent(@RequestBody Student student){
        return service.newStudent(student);
    }
    @DeleteMapping("/Student/{studentRegNo}")
    public String delete(@PathVariable Long studentRegNo){
        return service.deleteStudent(studentRegNo);
    }


}
