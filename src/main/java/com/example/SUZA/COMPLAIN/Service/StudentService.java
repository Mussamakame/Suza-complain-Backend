package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> fetchStudents(){
        return repository.findAll();
    }
    public Student newStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(Long studentReNo){
        return repository.findById(studentReNo).orElse(null);
    }

    public String deleteStudent(Long studentRegNo){
        repository.deleteById(studentRegNo);
        return "student deleted successful"+studentRegNo;
    }

    public ResponseEntity< Student> updateStudent(Long studentRegNo, Student studentDetails){
        Student student = repository.findById(studentRegNo).orElse(null);
        student.setStudentName(studentDetails.getStudentName());
        student.setStudentCampus(studentDetails.getStudentCampus());
        student.setStudentEmail(studentDetails.getStudentEmail());
        student.setCourse(studentDetails.getCourse());
        student.setDepartment(studentDetails.getDepartment());
        Student updateStudent = repository.save(student);
        return ResponseEntity.ok(updateStudent) ;
    }
}
