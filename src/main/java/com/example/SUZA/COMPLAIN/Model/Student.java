package com.example.SUZA.COMPLAIN.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentRegNo;
    private String studentName;
    private  String studentEmail;
    private int phoneNumber;
    private  String department;
    private String studentCampus;
    private String course;
    private String password;



}
